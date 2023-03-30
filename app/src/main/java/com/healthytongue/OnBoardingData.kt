package com.healthytongue

import androidx.compose.ui.graphics.Color
import com.healthytongue.ui.theme.ColorBlue

data class OnBoardingData(
    val image:Int,
    val backgroundColor: Color = ColorBlue,
    val mainColor: Color = ColorBlue,
    val mainText: String,
    val subText: String
)
