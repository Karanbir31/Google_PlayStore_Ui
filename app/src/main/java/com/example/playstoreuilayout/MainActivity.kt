package com.example.playstoreuilayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.playstoreuilayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            setSupportActionBar(toolbar)

            bottomNavView.setOnItemSelectedListener  { menuItem ->

                when (menuItem.itemId) {
                    R.id.homeFragment -> {
                        setCurrentFragment(HomeFragment())
                        true
                    }
                    R.id.topChartsFragment -> {
                        setCurrentFragment(TopChartsFragment())
                        true
                    }
                    R.id.categoriesFragment -> {
                        setCurrentFragment(CategoriesFragment())
                        true
                    }
                    else -> {
                        true
                    }
                }


            }

        }
    }


    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {

            replace(R.id.fragmentContainer, fragment)
            commit()
        }

    }


}