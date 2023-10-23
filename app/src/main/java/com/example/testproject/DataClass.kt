package com.example.testproject

import com.google.gson.annotations.SerializedName

data class Training(
    @SerializedName("lessons")
    val lessons: List<Lesson>,
    @SerializedName("option")
    val option: Option,
    @SerializedName("tabs")
    val tabs: List<Tab>,
    @SerializedName("trainers")
    val trainers: List<Trainer>
)

data class Trainer(
    @SerializedName("description")
    val description: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("image_url_medium")
    val imageUrlMedium: String,
    @SerializedName("image_url_small")
    val imageUrlSmall: String,
    @SerializedName("last_name")
    val lastName: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("position")
    val position: String
)

data class Tab(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)

data class Option(
    @SerializedName("club_name")
    val clubName: String,
    @SerializedName("link_android")
    val linkAndroid: String,
    @SerializedName("link_ios")
    val linkIos: String,
    @SerializedName("primary_color")
    val primaryColor: String,
    @SerializedName("secondary_color")
    val secondaryColor: String
)

data class Lesson(
    @SerializedName("appointment_id")
    val appointmentId: String,
    @SerializedName("available_slots")
    val availableSlots: Int,
    @SerializedName("client_recorded")
    val clientRecorded: Boolean,
    @SerializedName("coach_id")
    val coachId: String,
    @SerializedName("color")
    val color: String,
    @SerializedName("commercial")
    val commercial: Boolean,
    @SerializedName("date")
    val date: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("endTime")
    val endTime: String,
    @SerializedName("is_cancelled")
    val isCancelled: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("place")
    val place: String,
    @SerializedName("service_id")
    val serviceId: String,
    @SerializedName("startTime")
    val startTime: String,
    @SerializedName("tab")
    val tab: String,
    @SerializedName("tab_id")
    val tabId: Int
)