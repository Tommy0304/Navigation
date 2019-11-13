package com.example.demonavigationcontroller.navbottompersistent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demonavigationcontroller.R
import kotlinx.android.synthetic.main.activity_nav_bottom_persistent.*

class NavBottomPersistentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_bottom_persistent)
        setupBottomNavigationBar()
    }

    private fun setupBottomNavigationBar() {
        val navGraphIds = listOf(
            R.navigation.nav_bottom_persistent_home,
            R.navigation.nav_bottom_persistent_people,
            R.navigation.nav_bottom_persistent_album
        )

        bottom_nav_view.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.nav_host_container,
            intent = intent
        )
    }
}
