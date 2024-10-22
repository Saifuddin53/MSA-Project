package com.myprojects.msa_project.data

import com.myprojects.msa_project.BuildConfig
import com.myprojects.msa_project.data.dto.ShopResponseDto
import com.myprojects.msa_project.data.mappers.toShop
import com.myprojects.msa_project.data.networking.constructUrl
import com.myprojects.msa_project.data.networking.safeCall
import com.myprojects.msa_project.domain.Shop
import com.myprojects.msa_project.domain.ShopDataSource
import com.myprojects.msa_project.domain.util.NetworkError
import com.myprojects.msa_project.domain.util.Result
import com.myprojects.msa_project.domain.util.map
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.parameter

class RemoteShopDataSource(
    private val httpClient: HttpClient
): ShopDataSource {

    override suspend fun getNearbyShops(
        latitude: Double,
        longitude: Double,
        items: String,
        range: String
    ): Result<List<Shop>, NetworkError> {
        return safeCall<ShopResponseDto> {
            httpClient.get(
                urlString = constructUrl("/places/nearby")
            ) {
                header("Authorization", BuildConfig.API_KEY)

                // Add query parameters dynamically
                parameter("ll", "$latitude,$longitude")
                parameter("query", items) // For multiple queries like "pizza,juice"
                parameter("hacc", range)
            }
        }.map { response ->
            response.data.map { it.toShop() }
        }
    }
}