package com.example.testproject

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class App: Application() {

    private lateinit var viewModelFactory: MainViewModelFactory
    private lateinit var retrofit: RetrofitClient.ApiService

    override fun onCreate() {
        super.onCreate()
        retrofit = Retrofit.Builder()
            .baseUrl(RetrofitClient.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RetrofitClient.ApiService::class.java)
        viewModelFactory = MainViewModelFactory(retrofit)
    }

    fun <T : ViewModel> provideViewModel(clazz: Class<T>, owner: ViewModelStoreOwner) =
        ViewModelProvider(owner, viewModelFactory)[clazz]
}