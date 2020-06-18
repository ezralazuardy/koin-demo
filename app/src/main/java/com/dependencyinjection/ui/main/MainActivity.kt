package com.dependencyinjection.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dependencyinjection.R
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    // inject the view model class
    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // testing dependency injection
        val coffee = mainViewModel.getCoffee()
        coffee.drink()
    }
}