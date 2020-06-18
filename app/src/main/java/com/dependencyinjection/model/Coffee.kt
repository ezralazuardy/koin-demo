package com.dependencyinjection.model

import android.util.Log

data class Coffee(val amount: Int) {

    fun drink() = Log.d("Coffee", "drinking $amount ml of coffee...")
}