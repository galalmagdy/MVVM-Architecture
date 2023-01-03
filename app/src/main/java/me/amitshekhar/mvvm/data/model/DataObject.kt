package me.amitshekhar.mvvm.data.model

import com.google.gson.annotations.SerializedName

data class DataObject (
    @SerializedName("title")
    val title: String = "",
    @SerializedName("selftext")
    val selftext: String = "",
    @SerializedName("url")
    val url: String = "",
    @SerializedName("thumbnail_url")
    var thumbnail_url: String = "",
    @SerializedName("author")
    val author: String = ""
)