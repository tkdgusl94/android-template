package com.leveloper.template.presentation.ext

import androidx.fragment.app.Fragment

fun Fragment.showToast(resourceId: Int, isLongToast: Boolean = false) {
    context?.run {
        showToast(resourceId, isLongToast)
    }
}

fun Fragment.showToast(message: String, isLongToast: Boolean = false) {
    context?.run {
        showToast(message, isLongToast)
    }
}