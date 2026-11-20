package com.experimental.accessibili_buddy.data

import android.content.res.AssetManager
import kotlinx.serialization.json.Json

interface Repository {
    fun getAllTutorials(): List<Tutorial>

    fun getTutorial(tutorialId: Int): Tutorial
}

class RealRepository(
    private val assetManager: AssetManager,
) : Repository {
    override fun getAllTutorials(): List<Tutorial> {
        return listOf(
            "tutorials/beginner.json",
            "tutorials/intermediate.json",
            "tutorials/advanced.json",
        ).flatMap { loadFile(it) }
    }

    override fun getTutorial(tutorialId: Int): Tutorial {
        TODO("Not yet implemented")
    }

    private fun loadFile(path: String): List<Tutorial> {
        val file = assetManager.open(path).bufferedReader().use { it.readText() }
        return Json.decodeFromString<List<Tutorial>>(file)
    }
}