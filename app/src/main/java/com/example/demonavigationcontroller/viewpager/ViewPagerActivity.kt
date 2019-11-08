package com.example.demonavigationcontroller.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.demonavigationcontroller.R
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        view_pager.adapter = ViewPagerAdapter(supportFragmentManager)

        bottom_nav_view.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.fragmentHome -> view_pager.currentItem = 0
                R.id.fragmentPeople -> view_pager.currentItem = 1
                R.id.fragmentAlbum -> view_pager.currentItem = 2
            }
            false
        }

        var currentMenuItem = bottom_nav_view.menu.getItem(0)
        view_pager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) { }

            override fun onPageScrolled(pos: Int, posOffset: Float, posOffsetPixels: Int) { }

            override fun onPageSelected(position: Int) {
                if (currentMenuItem != null)
                    currentMenuItem.isChecked = false
                else
                    bottom_nav_view.menu.getItem(0).isChecked = false

                bottom_nav_view.menu.getItem(position).isChecked = true
                currentMenuItem = bottom_nav_view.menu.getItem(position)
            }

        })
    }

    inner class ViewPagerAdapter(fm: FragmentManager) :
        FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> Fragment1()
                1 -> Fragment2()
                else -> FragmentList()
            }
        }

        override fun getCount(): Int {
            return 3
        }
    }
}
