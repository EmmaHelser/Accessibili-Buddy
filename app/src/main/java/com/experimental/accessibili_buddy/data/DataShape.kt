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
    @SerialName("contacts") CONTACTS("Contacts"),
    @SerialName("email") EMAIL("Email"),
    @SerialName("web_browsing") WEB_BROWSING("Web Browsing"),
    @SerialName("maps_and_directions") MAPS_AND_DIRECTIONS("Maps & Directions"),
    @SerialName("notifications") NOTIFICATIONS("Notifications"),
    @SerialName("alarms_timers_and_reminders") ALARMS_TIMERS_AND_REMINDERS("Alarms, Timers, & Reminders"),
    @SerialName("calendar") CALENDAR("Calendar"),
    @SerialName("bluetooth_and_connecting_devices") BLUETOOTH_AND_CONNECTING_DEVICES("Bluetooth & Connecting Devices (headphones, car, speakers)"),
    @SerialName("accessibility") ACCESSIBILITY("Accessibility"),
    @SerialName("voice_assist_and_typing") VOICE_ASSIST_AND_TYPING("Voice Assistant & Voice Typing"),
    @SerialName("entertainment") ENTERTAINMENT("Music, Video, & Entertainment"),
    @SerialName("social_media") SOCIAL_MEDIA("Social Media"),
    @SerialName("accounts_and_backups") ACCOUNTS_AND_BACKUPS("Accounts & Backups (Google account, restoring a phone, transferring to a new phone)"),
    @SerialName("updates") UPDATES("Updates (system and app updates, what changed"),
    @SerialName("health_and_fitness") HEALTH_AND_FITNESS("Health & Fitness"),
    @SerialName("settings_and_customization") SETTINGS_AND_CUSTOMIZATION("Settings & Customization (wallpaper, homescreen layout, ringtones"),
    @SerialName("general") GENERAL("General"),
}