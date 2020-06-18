package com.dependencyinjection.ui.main

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import com.dependencyinjection.model.Coffee
import com.dependencyinjection.repository.CoffeeRepository

class MainViewModel(
    application: Application,
    private val coffeeRepository: CoffeeRepository
): AndroidViewModel(application) {

    val context: Context = application

    fun getCoffee(): Coffee = coffeeRepository.makeCoffee()
}