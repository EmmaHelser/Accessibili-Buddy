package com.experimental.accessibili_buddy.data

interface Repository {
    fun getAllTutorials(): List<Tutorial>

    fun getTutorial(tutorialId: Int): Tutorial
}

class RealRepository() : Repository {
    override fun getAllTutorials(): List<Tutorial> {
        TODO("Not yet implemented")
    }

    override fun getTutorial(tutorialId: Int): Tutorial {
        TODO("Not yet implemented")
    }
}