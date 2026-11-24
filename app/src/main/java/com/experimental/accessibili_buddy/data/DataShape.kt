package com.experimental.accessibili_buddy.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Tutorial(
    val id: Int,
    val name: String,
    val steps: List<String>,
    val level: LevelEnum,
    val category: Set<CategoryEnum>,
)

@Serializable
enum class LevelEnum(displayName: String) {
    @SerialName("beginner") BEGINNER("Beginner"),
    @SerialName("intermediate") INTERMEDIATE("Intermediate"),
    @SerialName("advanced") ADVANCED("Advanced"),
}

@Serializable
enum class CategoryEnum(val displayName: String) {
    @SerialName("camera") CAMERA("Camera"),
    @SerialName("texting") TEXTING("Texting"),
    @SerialName("general") GENERAL("General"),
}