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
    @SerialName("calls_and_video_chat") CALLS_AND_VIDEO_CHAT("Calls & Video Chat"),
    @SerialName("camera_and_photos") CAMERA_AND_PHOTOS("Camera & Photos"),
    @SerialName("texting") TEXTING("Texting"),
    @SerialName("apps") APPS("Apps"),
    @SerialName("sound_and_volume") SOUND_AND_VOLUME("Sound & Volume"),
    @SerialName("screen_and_text_size") SCREEN_AND_TEXT_SIZE("Screen & Text Size"),
    @SerialName("internet_and_wifi") INTERNET_AND_WIFI("Internet & Wi-Fi"),
    @SerialName("battery_and_storage") BATTERY_AND_STORAGE("Battery & Storage"),
    @SerialName("safety_and_security") SAFETY_AND_SECURITY("Safety & Security"),
    @SerialName("getting_around_the_phone") GETTING_AROUND_THE_PHONE("Getting Around the Phone"),
    @SerialName("general") GENERAL("General"),
}