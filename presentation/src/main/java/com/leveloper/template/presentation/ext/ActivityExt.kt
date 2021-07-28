package com.leveloper.template.presentation.ext

import android.app.Activity
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

/**
 * Force close keyboard
 */
fun Activity.hideKeyboard() {
    currentFocus?.let {
        inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)
    }
}

fun AppCompatActivity.replaceFragment(fragment: Fragment, @IdRes frameId: Int, tag: String? = null) {
    supportFragmentManager.transaction {
        replace(frameId, fragment, tag)
    }
}

fun AppCompatActivity.addFragment(fragment: Fragment, @IdRes frameId: Int, tag: String? = null) {
    supportFragmentManager.transaction {
        add(frameId, fragment, tag)
    }
}