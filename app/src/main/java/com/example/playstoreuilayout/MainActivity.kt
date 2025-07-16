package com.example.playstoreuilayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.playstoreuilayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setCurrentFragment(AppsFragment())
        binding.bottomNavView.selectedItemId = R.id.appsFragment

        binding.apply {
            Glide.with(this@MainActivity).load("https://randomuser.me/api/portraits/women/9.jpg").into(rcvUsersImage)

            bottomNavView.setOnItemSelectedListener { menuItem ->

                when (menuItem.itemId) {
                    R.id.gamesFragment -> {
                        setCurrentFragment(GamesFragment())
                        true
                    }

                    R.id.appsFragment -> {
                        setCurrentFragment(AppsFragment())
                        true
                    }

                    R.id.booksFragment -> {
                        setCurrentFragment(GamesFragment())
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