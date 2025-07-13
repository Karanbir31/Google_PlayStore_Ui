package com.example.playstoreuilayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playstoreuilayout.databinding.RcvBodyAppGridBinding

class RcvBodyAppsGridAdapter() : RecyclerView.Adapter<RcvBodyAppsGridAdapter.RcvViewHolder>() {

    inner class RcvViewHolder(val binding: RcvBodyAppGridBinding) :
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RcvViewHolder {
        val binding = RcvBodyAppGridBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return RcvViewHolder(binding)
    }

    override fun getItemCount() = 10

    override fun onBindViewHolder(holder: RcvViewHolder, position: Int) {
        holder.binding.apply {




        }
    }
}