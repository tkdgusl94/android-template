package com.leveloper.template.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment

abstract class BaseDialogFragment<B : ViewDataBinding>(private val layoutId: Int) : DialogFragment() {

    protected lateinit var binding: B

    abstract fun setBindings()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)

        performDataBinding()

        return binding.root
    }

    private fun performDataBinding() {
        setBindings()

        binding.lifecycleOwner = this
        binding.executePendingBindings()
    }
}