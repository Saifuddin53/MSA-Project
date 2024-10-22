package com.myprojects.msa_project.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class LocationDto(
    val formatted_address: String
)