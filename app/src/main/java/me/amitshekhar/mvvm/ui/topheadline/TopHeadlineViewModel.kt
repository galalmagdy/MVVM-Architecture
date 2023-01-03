package me.amitshekhar.mvvm.ui.topheadline

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import me.amitshekhar.mvvm.data.model.Children
import me.amitshekhar.mvvm.data.repository.TopHeadlineRepository
import me.amitshekhar.mvvm.utils.Resource

class TopHeadlineViewModel(private val topHeadlineRepository: TopHeadlineRepository) : ViewModel() {

    private val _childrenList = MutableStateFlow<Resource<List<Children>>>(Resource.loading())

    val childrenList: StateFlow<Resource<List<Children>>> = _childrenList

    init {
        fetchTopHeadlines()
    }

    private fun fetchTopHeadlines() {
        viewModelScope.launch {
            topHeadlineRepository.getTopHeadlines()
                .catch { e ->
                    _childrenList.value = Resource.error(e.toString())
                }
                .collect {
                    _childrenList.value = Resource.success(it)
                }
        }
    }

}