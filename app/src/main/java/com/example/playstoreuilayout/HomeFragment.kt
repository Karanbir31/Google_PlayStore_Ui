package com.example.playstoreuilayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.playstoreuilayout.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private val snapHelperHead = PagerSnapHelper()
    private val snapHelperBody = PagerSnapHelper()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

            snapHelperHead.attachToRecyclerView(rcvHeader)
            snapHelperBody.attachToRecyclerView(rcvBodyApp)

            rcvHeader.adapter = RcvHeaderAdapter()

            rcvBodyApp.layoutManager = GridLayoutManager(
                requireContext(),
                3,
                GridLayoutManager.HORIZONTAL,
                false
            )

            rcvBodyApp.adapter = RcvBodyAppsGridAdapter()


        }
    }

}