package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
<<<<<<< HEAD
import androidx.viewpager.widget.ViewPager
=======
>>>>>>> bd9a758 (1.1)
import androidx.viewpager2.widget.ViewPager2
import com.example.lesson1.databinding.ActivityMainBinding
import com.example.lesson1.fragments.FirstFragment
import com.example.lesson1.fragments.SecondFragment
import com.example.lesson1.fragments.ThirdFragment
import com.example.lesson1.adapter.ViewPagerAdapter
<<<<<<< HEAD
import com.google.android.material.tabs.TabLayout
=======
>>>>>>> bd9a758 (1.1)

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
<<<<<<< HEAD

private fun TabLayout.setupWithViewPager(viewPager: ViewPager2) {

}
=======
>>>>>>> bd9a758 (1.1)
