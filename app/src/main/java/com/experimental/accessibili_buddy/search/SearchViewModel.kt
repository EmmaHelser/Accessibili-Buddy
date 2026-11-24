package com.experimental.accessibili_buddy.search

import androidx.lifecycle.ViewModel
import com.experimental.accessibili_buddy.data.Repository
import javax.inject.Inject

class SearchViewModel @Inject constructor(
    private val repository: Repository,
): ViewModel() {
}