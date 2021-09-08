package com.android.calculator.model

data class MainData(
    var newState: Boolean = true,
    var hasPoint: Boolean = false,
    var oldNum: String = "",
    var finalNum: String = "",
    var calculateType: String = "",
)