package com.example.testproject

import retrofit2.Response
import retrofit2.http.GET

class RetrofitClient {

    interface ApiService{

        @GET("schedule/get_v3/?club_id=2")
        suspend fun getTrainingList(): Response<Training>
    }

    companion object {
        val BASE_URL = "https://olimpia.fitnesskit-admin.ru/"
    }
}