package com.myprojects.msa_project.di

import com.myprojects.msa_project.data.RemoteShopDataSource
import com.myprojects.msa_project.data.networking.HttpClientFactory
import com.myprojects.msa_project.domain.ShopDataSource
import com.myprojects.msa_project.presentation.shop_list.ShopListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteShopDataSource).bind<ShopDataSource>()

    viewModelOf(::ShopListViewModel)
}