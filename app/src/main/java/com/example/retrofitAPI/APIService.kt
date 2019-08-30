package com.example.retrofitAPI

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface APIService {

    @POST("/api/users")
    @FormUrlEncoded
    fun savePost(
        @Field("name") name: String,
        @Field("job") job: String
    ): Call<Model>
}