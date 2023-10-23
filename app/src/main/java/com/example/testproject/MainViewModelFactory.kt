package com.example.testproject

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory constructor(
    private val retrofit : RetrofitClient.ApiService
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>) : T {
        if (modelClass.isAssignableFrom(ViewModelTraining::class.java)) {
            return ViewModelTraining(retrofit) as T
        }
        throw java.lang.IllegalArgumentException("Unknown class name")
    }
}