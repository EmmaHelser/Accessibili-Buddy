package com.experimental.accessibili_buddy.search

import androidx.lifecycle.ViewModel
import com.experimental.accessibili_buddy.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val repository: Repository,
): ViewModel() {
}