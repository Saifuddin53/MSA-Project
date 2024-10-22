package com.myprojects.msa_project.domain

data class Shop(
    val id: String,
    val name: String,
    val distance: Int,
    val closedBucket: String,
    val address: String
)
