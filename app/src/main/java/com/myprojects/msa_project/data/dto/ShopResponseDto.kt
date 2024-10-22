package com.myprojects.msa_project.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ShopResponseDto(
    @SerialName("results") val data: List<ShopDto>
)