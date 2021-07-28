package com.leveloper.template.presentation.ext

import android.os.SystemClock
import android.view.View

private const val MIN_CLICK_INTERVAL = 500L

/**
 * Single Click
 */
fun View.setOnSingleClickListener(onSingleClick: (View) -> Unit) {
    var lastClickTime = 0L

    setOnClickListener {
        val elapsedTime = SystemClock.elapsedRealtime() - lastClickTime

        if (elapsedTime < MIN_CLICK_INTERVAL) return@setOnClickListener

        lastClickTime = SystemClock.elapsedRealtime()

        onSingleClick(this)
    }
}