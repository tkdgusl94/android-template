package com.leveloper.template.presentation.ext

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

fun FragmentManager.transaction(action: FragmentTransaction.() -> Unit) {
    beginTransaction().apply(action).commitAllowingStateLoss()
}

fun FragmentManager.containTag(tag: String?): Boolean {
    return this.findFragmentByTag(tag) != null
}