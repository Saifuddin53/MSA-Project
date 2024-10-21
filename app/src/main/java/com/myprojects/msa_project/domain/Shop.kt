package com.myprojects.msa_project.domain

data class Shop(
    val id: String,
    val name: String,
    val imageUrl: String,
    val distance: Double,
    val closedBucket: String
)
