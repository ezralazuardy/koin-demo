package com.dependencyinjection.repository

import android.util.Log
import com.dependencyinjection.model.Coffee
import com.dependencyinjection.model.CoffeeBean

class CoffeeRepository(private val coffeeBean: CoffeeBean) {

    fun makeCoffee(): Coffee {
        Log.d("CoffeeMaker", "making coffee with ${coffeeBean.amount} mg of coffee beans...")
        return Coffee(coffeeBean.amount / 2)
    }
}