package com.myprojects.msa_project.data.mappers

import com.myprojects.msa_project.data.dto.ShopDto
import com.myprojects.msa_project.domain.Shop
import com.myprojects.msa_project.presentation.util.getFormattedClosedBucket

fun ShopDto.toShop(): Shop {
    return Shop(
        id = id,
        name = name,
        distance = distance,
        closedBucket = getFormattedClosedBucket(closedBucket),
        address = location.formattedAddress
    )
}