package com.fmsstech.core

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Modifier.padding(
    horizontal: Dp? = null,
    vertical: Dp? = null,
    top: Dp? = null,
    bottom: Dp? = null,
    start: Dp? = null,
    end: Dp? = null
): Modifier {
    val finalTop = top ?: vertical ?: 0.dp
    val finalBottom = bottom ?: vertical ?: 0.dp
    val finalStart = start ?: horizontal ?: 0.dp
    val finalEnd = end ?: horizontal ?: 0.dp

    return this.then(
        Modifier.padding(
            start = finalStart,
            top = finalTop,
            end = finalEnd,
            bottom = finalBottom
        )
    )
}
