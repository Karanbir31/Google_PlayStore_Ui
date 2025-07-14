package com.example.playstoreuilayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

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
            1-> return HomeFragment()
            2-> return CategoriesFragment()
            else -> CategoriesFragment()
        }
        return HomeFragment()
    }
}