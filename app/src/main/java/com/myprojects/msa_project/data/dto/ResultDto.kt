package com.myprojects.msa_project.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class ResultDto(
    val categories: List<CategoryDto>,
    val closed_bucket: String,
    val distance: Int,
    val fsq_id: String,
    val link: String,
    val location: LocationDto,
    val name: String,
    val timezone: String
)