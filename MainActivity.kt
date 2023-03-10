package com.softsquared.template.kotlin.src.main

import android.os.Bundle
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseActivity
import com.softsquared.template.kotlin.databinding.ActivityMainBinding
import com.softsquared.template.kotlin.src.main.Dongne.DongneFragment
import com.softsquared.template.kotlin.src.main.home.HomeFragment
<<<<<<< HEAD
=======
import com.softsquared.template.kotlin.src.main.login.LoginFragment
>>>>>>> 450307fa3c4f9b46661535ec9496c55390f198a7
import com.softsquared.template.kotlin.src.main.myPage.MyPageFragment

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainBtmNav.run {
            setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.menu_main_btm_nav_home -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, HomeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_main_btm_nav_my_page -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MyPageFragment())
                            .commitAllowingStateLoss()
                    }
                }
                true
            }
            selectedItemId = R.id.menu_main_btm_nav_home
        }
    }

    override fun onStart() {
        super.onStart()
        supportFragmentManager.beginTransaction()
            //.replace(R.id.main_frm, LogInFragment())
            .commitAllowingStateLoss()
    }
}