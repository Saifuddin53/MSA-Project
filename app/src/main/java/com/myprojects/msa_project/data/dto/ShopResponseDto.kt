package com.myprojects.msa_project.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class ShopResponseDto(
    val data: List<ShopDto>
)