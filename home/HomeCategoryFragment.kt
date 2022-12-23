package com.softsquared.template.kotlin.src.main.home

import android.os.Bundle
import android.view.View
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseFragment
import com.softsquared.template.kotlin.databinding.FragmentHomeBinding
import com.softsquared.template.kotlin.databinding.FragmentHomeCategoryBinding

class HomeCategoryFragment : BaseFragment<FragmentHomeCategoryBinding>(FragmentHomeCategoryBinding::bind, R.layout.fragment_home_category) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imgbtnBack.setOnClickListener{
            val transaction = parentFragmentManager.beginTransaction()
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}