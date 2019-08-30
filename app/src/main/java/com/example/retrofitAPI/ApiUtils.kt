package com.example.retrofitAPI

object ApiUtils {

    val BASE_URL = "https://reqres.in"

    val apiService: APIService
        get() = RetrofitClient.getClient(BASE_URL).create(APIService::class.java)
}