package com.example.playstoreuilayout

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.playstoreuilayout.databinding.FragmentAppsBinding
import com.google.android.material.tabs.TabLayoutMediator


class AppsFragment : Fragment() {

    private lateinit var binding : FragmentAppsBinding

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

        binding = FragmentAppsBinding.inflate(inflater, container, false)
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