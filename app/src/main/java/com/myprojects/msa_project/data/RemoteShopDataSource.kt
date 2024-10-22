package com.myprojects.msa_project.data

import com.myprojects.msa_project.domain.Shop
import com.myprojects.msa_project.domain.ShopDataSource
import com.myprojects.msa_project.domain.util.NetworkError
import com.myprojects.msa_project.domain.util.Result
import io.ktor.client.HttpClient

class RemoteShopDataSource(
    httpClient: HttpClient
): ShopDataSource {

    override suspend fun getNearbyShops(): Result<List<Shop>, NetworkError> {
        TODO("Not yet implemented")
    }
}