package me.amitshekhar.mvvm.data.model

import com.google.gson.annotations.SerializedName


data class TopHeadlinesResponse(
    @SerializedName("data")
    val data: Data
)
