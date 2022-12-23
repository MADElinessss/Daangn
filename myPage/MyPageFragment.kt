package com.softsquared.template.kotlin.src.main.myPage

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.TranslateAnimation
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseFragment
import com.softsquared.template.kotlin.databinding.FragmentMyPageBinding

class MyPageFragment :
    BaseFragment<FragmentMyPageBinding>(FragmentMyPageBinding::bind, R.layout.fragment_my_page) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.scrollview.setOnScrollChangeListener{ v, scrollX, scrollY, oldScrollX, oldScrollY ->
            //스크롤 아래로
            if(scrollY > oldScrollY){
                /*
                val anim = TranslateAnimation(0f, binding.loading.width.toFloat(), 0f, 0f)
                anim.duration = 100
                 */
            }
            // 스크롤 위로
            if (scrollY + 5 < oldScrollY) {
                /*
                val anim =
                    TranslateAnimation(binding.toyUploadBtn.width.toFloat() + 1000, 0f, 0f, 0f)
                anim.duration = 100
                 */
                binding.btnSetting.visibility = View.VISIBLE
                binding.tvNavMenu.visibility = View.VISIBLE
            }
        }
        binding.btnSetting.setOnClickListener{

        }
        binding.btnPayCharge.setOnClickListener{

        }
        binding.btnViewProfile.setOnClickListener {

        }
    }
}