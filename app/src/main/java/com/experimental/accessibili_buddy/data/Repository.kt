package com.experimental.accessibili_buddy.data

import android.content.res.AssetManager

interface Repository {
    fun getAllTutorials(): List<Tutorial>

    fun getTutorial(tutorialId: Int): Tutorial
}

class RealRepository(
    private val assetManager: AssetManager,
) : Repository {
    override fun getAllTutorials(): List<Tutorial> {
        TODO("Not yet implemented")
    }

    override fun getTutorial(tutorialId: Int): Tutorial {
        TODO("Not yet implemented")
    }
}