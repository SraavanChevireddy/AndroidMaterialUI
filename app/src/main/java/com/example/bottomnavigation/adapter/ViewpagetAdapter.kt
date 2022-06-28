package com.example.bottomnavigation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.bottomnavigation.Fragments.CallFragment
import com.example.bottomnavigation.Fragments.ChatsFragment
import com.example.bottomnavigation.Fragments.StatusFragment

class ViewpagetAdapter(supportFragmentManager: FragmentManager):FragmentPagerAdapter(supportFragmentManager) {
    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentTitleList = ArrayList<String>()
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> {
                return ChatsFragment()
            }
            1 ->{
                return CallFragment()
            }
            2 -> {
                return StatusFragment()
            }
            else->{
                return ChatsFragment()
            }
        }
    }
}