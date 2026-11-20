package com.experimental.accessibili_buddy.data

interface Repository {
    fun getAllTutorials(): List<Tutorial>

    fun getTutorial(tutorialId: Int): Tutorial
}