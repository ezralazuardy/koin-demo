package com.dependencyinjection.di

import com.dependencyinjection.model.CoffeeBean
import com.dependencyinjection.repository.CoffeeRepository
import com.dependencyinjection.ui.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { CoffeeBean(10) }
    single { CoffeeRepository(get()) }

    viewModel { MainViewModel(get(), get()) }
}