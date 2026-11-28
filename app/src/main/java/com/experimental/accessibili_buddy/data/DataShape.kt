package com.experimental.accessibili_buddy.data

import androidx.annotation.StringRes
import com.experimental.accessibili_buddy.R
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
enum class LevelEnum(@StringRes val displayName: Int) {
    @SerialName("beginner") BEGINNER(R.string.beginner_tag),
    @SerialName("intermediate") INTERMEDIATE(R.string.intermediate_tag),
    @SerialName("advanced") ADVANCED(R.string.advanced_tag),
}

@Serializable
enum class CategoryEnum(val displayName: String, val ranking: Int) {
    @SerialName("calls_and_video_chat") CALLS_AND_VIDEO_CHAT("Calls & Video Chat", 1),
    @SerialName("camera_and_photos") CAMERA_AND_PHOTOS("Camera & Photos", 1),
    @SerialName("texting") TEXTING("Texting", 1),
    @SerialName("apps") APPS("Apps", 2),
    @SerialName("sound_and_volume") SOUND_AND_VOLUME("Sound & Volume", 1),
    @SerialName("screen_and_text_size") SCREEN_AND_TEXT_SIZE("Screen & Text Size", 1),
    @SerialName("internet_and_wifi") INTERNET_AND_WIFI("Internet & Wi-Fi", 1),
    @SerialName("battery_and_storage") BATTERY_AND_STORAGE("Battery & Storage", 3),
    @SerialName("safety_and_security") SAFETY_AND_SECURITY("Safety & Security", 1),
    @SerialName("getting_around_the_phone") GETTING_AROUND_THE_PHONE("Getting Around the Phone", 1),
    @SerialName("contacts") CONTACTS("Contacts", 2),
    @SerialName("email") EMAIL("Email", 2),
    @SerialName("web_browsing") WEB_BROWSING("Web Browsing", 3),
    @SerialName("maps_and_directions") MAPS_AND_DIRECTIONS("Maps & Directions", 2),
    @SerialName("notifications") NOTIFICATIONS("Notifications", 3),
    @SerialName("alarms_timers_and_reminders") ALARMS_TIMERS_AND_REMINDERS("Alarms, Timers, & Reminders", 2),
    @SerialName("calendar") CALENDAR("Calendar", 2),
    @SerialName("bluetooth_and_connecting_devices") BLUETOOTH_AND_CONNECTING_DEVICES("Bluetooth & Connecting Devices", 3),
    @SerialName("accessibility") ACCESSIBILITY("Accessibility", 2),
    @SerialName("voice_assist_and_typing") VOICE_ASSIST_AND_TYPING("Voice Assistant & Voice Typing", 3),
    @SerialName("entertainment") ENTERTAINMENT("Music, Video, & Entertainment", 3),
    @SerialName("social_media") SOCIAL_MEDIA("Social Media", 3),
    @SerialName("accounts_and_backups") ACCOUNTS_AND_BACKUPS("Accounts & Backups", 2),
    @SerialName("updates") UPDATES("Updates", 1),
    @SerialName("health_and_fitness") HEALTH_AND_FITNESS("Health & Fitness", 3),
    @SerialName("settings_and_customization") SETTINGS_AND_CUSTOMIZATION("Settings & Customization", 3),
}