package me.amitshekhar.mvvm.data.api

import me.amitshekhar.mvvm.data.model.TopHeadlinesResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface NetworkService {

    @GET("r/kotlin/.json")
    suspend fun getTopHeadlines(): TopHeadlinesResponse

}