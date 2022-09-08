package com.example.lesson1.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(val items: ArrayList<Fragment>, activity: AppCompatActivity)
    : FragmentStateAdapter(activity) {

    private var fragmentList = ArrayList<Fragment> ()
    private var titleList = ArrayList<String>()

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        titleList.add(title)
    }

    override fun getItemCount(): Int = items.size

    override fun createFragment(position: Int): Fragment = items[position]
}