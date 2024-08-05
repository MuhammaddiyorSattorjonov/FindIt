package com.example.layouts.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.layouts.R
import com.example.layouts.databinding.FragmentPostBinding


class PostFragment : Fragment() {
    private val binding by lazy {FragmentPostBinding.inflate(layoutInflater)}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return binding.root
    }
}