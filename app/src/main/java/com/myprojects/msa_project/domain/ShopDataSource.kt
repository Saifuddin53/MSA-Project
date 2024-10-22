package com.myprojects.msa_project.domain

import com.myprojects.msa_project.domain.util.NetworkError
import com.myprojects.msa_project.domain.util.Result

interface ShopDataSource {

    suspend fun getNearbyShops(): Result<List<Shop>, NetworkError>

}