package com.experimental.accessibili_buddy.data

import android.content.res.AssetManager
import kotlinx.serialization.json.Json
import javax.inject.Inject
import javax.inject.Singleton

interface Repository {
    fun getAllTutorials(): List<Tutorial>

    fun getTutorial(tutorialId: Int): Tutorial?
}

@Singleton
class RealRepository @Inject constructor(
    private val assetManager: AssetManager,
) : Repository {
    private val allTutorials = mutableListOf<Tutorial>()

    init {
        val tutorials =  listOf(
            "tutorials/beginner.json",
            "tutorials/intermediate.json",
            "tutorials/advanced.json",
        ).flatMap { loadFile(it) }

        allTutorials.addAll(tutorials)
    }

    override fun getAllTutorials(): List<Tutorial> {
        return allTutorials
    }

    override fun getTutorial(tutorialId: Int): Tutorial? {
        return allTutorials.firstOrNull { it.id == tutorialId }
    }

    private fun loadFile(path: String): List<Tutorial> {
        val file = assetManager.open(path).bufferedReader().use { it.readText() }
        return Json.decodeFromString<List<Tutorial>>(file)
    }
}