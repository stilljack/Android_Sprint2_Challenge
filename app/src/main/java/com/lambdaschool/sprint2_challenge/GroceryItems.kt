package com.lambdaschool.sprint2_challenge

data class GroceryItems (
    val kind: String,
    val resourceId: Int,
    var ordered: Boolean = false
)