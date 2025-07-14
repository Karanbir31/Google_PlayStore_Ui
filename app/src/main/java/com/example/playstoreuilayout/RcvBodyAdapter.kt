package com.example.playstoreuilayout

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.playstoreuilayout.databinding.RcvBodyBinding

class RcvBodyAdapter() : RecyclerView.Adapter<RcvBodyAdapter.RcvViewHolder>() {
    private lateinit var context: Context
    private val snapHelperGrid = PagerSnapHelper()

    inner class RcvViewHolder(val binding : RcvBodyBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RcvViewHolder {
        context = parent.context

        val binding = RcvBodyBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RcvViewHolder(binding)
    }

    override fun getItemCount(): Int = 6

    override fun onBindViewHolder(holder: RcvViewHolder, position: Int) {
       holder.binding.apply {
           snapHelperGrid.attachToRecyclerView(rcvBodyInnerRcvGrid)
           rcvBodyInnerRcvGrid.adapter = RcvBodyAppsGridAdapter()

           rcvBodyInnerRcvGrid.layoutManager = GridLayoutManager(
               context,
               3,
               GridLayoutManager.HORIZONTAL,
               false
           )

       }
    }
}