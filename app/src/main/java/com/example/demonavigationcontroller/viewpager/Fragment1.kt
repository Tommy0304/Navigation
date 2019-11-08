package com.example.demonavigationcontroller.viewpager

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.demonavigationcontroller.R
import com.example.demonavigationcontroller.setGone
import kotlinx.android.synthetic.main.fragment1.view.*

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment1, null)

        view.container.setBackgroundColor(Color.parseColor("#5500ff00"))
        view.info.setText(R.string.home)
        view.navigate.setGone()

        return view
    }
}