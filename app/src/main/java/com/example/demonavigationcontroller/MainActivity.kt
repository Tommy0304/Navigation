package com.example.demonavigationcontroller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demonavigationcontroller.navbottom.NavBottomActivity
import com.example.demonavigationcontroller.navbottompersistent.NavBottomPersistentActivity
import com.example.demonavigationcontroller.navindepth.NavInDepthActivity
import com.example.demonavigationcontroller.viewpager.ViewPagerActivity
import com.example.demonavigationcontroller.viewpager2.ViewPager2Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nav_controller.setOnClickListener {
            val clazz = NavInDepthActivity::class.java
            startActivity(Intent(this, clazz))
        }
        nav_controller_bottomnav.setOnClickListener {
            val clazz = NavBottomActivity::class.java
            startActivity(Intent(this, clazz))
        }
        nav_controller_bottomnav_persistent.setOnClickListener {
            val clazz = NavBottomPersistentActivity::class.java
            startActivity(Intent(this, clazz))
        }
        view_pager.setOnClickListener {
            val clazz = ViewPagerActivity::class.java
            startActivity(Intent(this, clazz))
        }
        view_pager2.setOnClickListener {
            val clazz = ViewPager2Activity::class.java
            startActivity(Intent(this, clazz))
        }
    }
}
