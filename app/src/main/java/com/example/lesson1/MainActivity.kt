package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.lesson1.databinding.ActivityMainBinding
import com.example.lesson1.fragments.FirstFragment
import com.example.lesson1.fragments.SecondFragment
import com.example.lesson1.fragments.ThirdFragment
import com.example.lesson1.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fragments : ArrayList<Fragment> = arrayListOf(
        FirstFragment(),
        SecondFragment(),
        ThirdFragment()
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager : ViewPager2 = binding.viewPager
        val adapter = ViewPagerAdapter(fragments, this)

        viewPager.adapter = adapter
    }
}

private fun TabLayout.setupWithViewPager(viewPager: ViewPager2) {

}
