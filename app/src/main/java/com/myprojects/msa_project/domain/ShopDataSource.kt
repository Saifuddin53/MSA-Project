package com.myprojects.msa_project.domain

import com.myprojects.msa_project.domain.util.NetworkError
import com.myprojects.msa_project.domain.util.Result

interface ShopDataSource {

    suspend fun getNearbyShops(
        latitude: Double,
        longitude: Double,
        items: String,
        range: String
    ): Result<List<Shop>, NetworkError>

}