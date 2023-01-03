package me.amitshekhar.mvvm.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import me.amitshekhar.mvvm.data.api.NetworkService
import me.amitshekhar.mvvm.data.model.Children
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TopHeadlineRepository @Inject constructor(private val networkService: NetworkService) {

    fun getTopHeadlines(): Flow<List<Children>> {
        return flow {
            emit(networkService.getTopHeadlines().data)
        }.map {
            it.children
        }
    }

}