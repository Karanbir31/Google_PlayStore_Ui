package com.example.playstoreuilayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.playstoreuilayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val  snapHelperHead= PagerSnapHelper()
    private val  snapHelperBody= PagerSnapHelper()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            snapHelperHead.attachToRecyclerView(rcvHeader)
            snapHelperBody.attachToRecyclerView(rcvBodyApp)

            rcvHeader.adapter = RcvHeaderAdapter()

            rcvBodyApp.layoutManager =
                GridLayoutManager(
                    this@MainActivity,
                    3, GridLayoutManager.HORIZONTAL,
                    false
                )
            rcvBodyApp.adapter = RcvBodyAppsGridAdapter()

        }


    }
}