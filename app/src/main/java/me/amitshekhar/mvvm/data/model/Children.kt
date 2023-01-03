package me.amitshekhar.mvvm.data.model

import com.google.gson.annotations.SerializedName

data class Children(

    @SerializedName("data" )
    var data : DataObject = DataObject(),
)