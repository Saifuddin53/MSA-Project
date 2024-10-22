package com.myprojects.msa_project.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ShopDto(
    @SerialName("fsq_id") val id: String,
    @SerialName("closed_bucket") val closedBucket: String,
    val distance: Int,
    val location: LocationDto,
    val name: String
)