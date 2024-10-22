package com.myprojects.msa_project.data.mappers

import com.myprojects.msa_project.data.dto.CategoryDto
import com.myprojects.msa_project.data.dto.ShopDto
import com.myprojects.msa_project.domain.Shop

fun ShopDto.toShop(): Shop {
    val category = categories.firstOrNull()
    return Shop(
        id = id,
        name = name,
        imageUrl = category?.getImageUrl() ?: "",
        distance = distance,
        closedBucket = closedBucket,
        address = location.formattedAddress
    )
}

fun CategoryDto.getImageUrl(): String {
    return icon.prefix + icon.suffix
}