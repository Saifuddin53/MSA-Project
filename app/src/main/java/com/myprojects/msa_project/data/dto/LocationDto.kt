package com.myprojects.msa_project.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LocationDto(
    @SerialName("formatted_address") val formattedAddress: String
)