package com.softsquared.template.kotlin.src.main.home

import android.os.Bundle
<<<<<<< HEAD
import android.text.TextUtils.replace
=======
>>>>>>> 450307fa3c4f9b46661535ec9496c55390f198a7
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
<<<<<<< HEAD
import androidx.viewbinding.ViewBinding
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseFragment
import com.softsquared.template.kotlin.databinding.ActivityMainBinding
import com.softsquared.template.kotlin.databinding.FragmentHomeBinding
import com.softsquared.template.kotlin.databinding.FragmentHomeCategoryBinding
=======
import com.softsquared.template.kotlin.databinding.FragmentHomeBinding
>>>>>>> 450307fa3c4f9b46661535ec9496c55390f198a7

class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    private val dataList = ArrayList<Data>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)

<<<<<<< HEAD
        binding.btnCategory.setOnClickListener { item ->
            childFragmentManager.beginTransaction()
                .replace(R.id.homefrag, HomeCategoryFragment())
                .commitAllowingStateLoss()
        }
=======

>>>>>>> 450307fa3c4f9b46661535ec9496c55390f198a7


        dataList.add(Data("df","dd","dd","dd","dd","dd","dd"))
        val adapter = context?.let { RvAdapter(it,dataList) }
        binding.rvHome.adapter= adapter

        binding.rvHome.layoutManager= LinearLayoutManager(context)

        return binding.root
    }

}