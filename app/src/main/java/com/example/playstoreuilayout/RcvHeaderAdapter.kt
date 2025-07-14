package com.example.playstoreuilayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playstoreuilayout.databinding.RcvHeaderItemBinding

class RcvHeaderAdapter() : RecyclerView.Adapter<RcvHeaderAdapter.RcvHeaderViewHolder>() {

    inner class RcvHeaderViewHolder(val binding: RcvHeaderItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RcvHeaderViewHolder {
        val binding =
            RcvHeaderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RcvHeaderViewHolder(binding)
    }

    override fun getItemCount() = 10

    override fun onBindViewHolder(holder: RcvHeaderViewHolder, position: Int) {
        holder.binding.apply {

            rcvHeaderTitle.append(position.toString())
        }
    }
}