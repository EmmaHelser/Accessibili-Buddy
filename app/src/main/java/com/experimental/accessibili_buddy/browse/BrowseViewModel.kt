package com.experimental.accessibili_buddy.browse

import androidx.lifecycle.ViewModel
import com.experimental.accessibili_buddy.data.Repository
import javax.inject.Inject

class BrowseViewModel @Inject constructor(
    private val repository: Repository,
): ViewModel() {
}