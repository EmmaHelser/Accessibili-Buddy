package com.experimental.accessibili_buddy.saved

import androidx.lifecycle.ViewModel
import com.experimental.accessibili_buddy.data.Repository
import javax.inject.Inject

class SavedViewModel @Inject constructor(
    private val repository: Repository,
): ViewModel() {
}