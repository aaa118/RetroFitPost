package com.example.retrofitAPI

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Model (
    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("job")
    @Expose
    var job: String? = null,
    @SerializedName("createdAt")
    @Expose
    var createdAt: String? = null,
    @SerializedName("id")
    @Expose
    var id: Int? = null
)