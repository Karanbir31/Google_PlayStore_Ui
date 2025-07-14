package com.example.playstoreuilayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPager2Adapter(
    private val tabsList: List<String>,
    private val fragmentManager: FragmentManager,
    private val lifecycle: Lifecycle
) : FragmentStateAdapter(
    fragmentManager, lifecycle
) {
    override fun getItemCount(): Int = tabsList.size

    override fun createFragment(position: Int): Fragment {
        when(position){
            0-> return HomeFragment()
            1 -> return TopChartsFragment()
            2-> return CategoriesFragment()
            3 -> return CategoriesFragment()
        }
        return HomeFragment()
    }
}