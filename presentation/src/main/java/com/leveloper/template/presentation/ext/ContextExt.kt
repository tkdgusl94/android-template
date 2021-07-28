package com.leveloper.template.presentation.ext

import android.content.Context
import android.content.Context.*
import android.location.LocationManager
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

fun Context.showToast(message: String, isLongToast: Boolean = false) {
    Toast.makeText(
        this,
        message,
        if (isLongToast) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
    ).show()
}

fun Context.showToast(resourceId: Int, isLongToast: Boolean = false) {
    showToast(getString(resourceId), isLongToast)
}

val Context.inputMethodManager: InputMethodManager
    get() = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager

val Context.locationManager: LocationManager
    get() = getSystemService(LOCATION_SERVICE) as LocationManager

val Context.windowManager: WindowManager
    get() = getSystemService(WINDOW_SERVICE) as WindowManager