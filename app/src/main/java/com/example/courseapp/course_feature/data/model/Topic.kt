package com.example.courseapp.course_feature.data.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name: Int,
    val assocCourses: Int,
    @DrawableRes val image: Int,
)
