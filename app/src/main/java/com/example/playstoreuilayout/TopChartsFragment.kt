package com.example.playstoreuilayout

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.playstoreuilayout.databinding.FragmentTopChartsBinding
import com.google.android.material.tabs.TabLayoutMediator

class TopChartsFragment : Fragment() {

    private lateinit var binding: FragmentTopChartsBinding
    private val tabsList = listOf(
        "For you",
        "Top charts",
        "Children",
        "Categories"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTopChartsBinding.inflate(inflater, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            viewpage2.adapter = ViewPager2Adapter(tabsList, childFragmentManager, lifecycle)

            TabLayoutMediator(tabLayout, viewpage2) { tab, position ->
                tab.text = tabsList[position]
                Log.d("tab text", "${tab.text}")

            }.attach()
        }


    }
}