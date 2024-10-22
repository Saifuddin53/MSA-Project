package com.myprojects.msa_project.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class IconDto(
    val prefix: String,
    val suffix: String
)