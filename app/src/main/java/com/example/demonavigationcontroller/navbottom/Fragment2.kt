package com.example.demonavigationcontroller.navbottom

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.demonavigationcontroller.R
import com.example.demonavigationcontroller.setGone
import kotlinx.android.synthetic.main.fragment2.view.*

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment2, null)

        view.container.setBackgroundColor(Color.parseColor("#aaff0000"))
        view.info.setText(R.string.people)
        view.navigate.setGone()

        return view
    }
}