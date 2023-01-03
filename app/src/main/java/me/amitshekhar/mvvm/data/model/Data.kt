package me.amitshekhar.mvvm.data.model

import com.google.gson.annotations.SerializedName

data class Data (

    @SerializedName("children")
    val children: List<Children> = ArrayList(),
)