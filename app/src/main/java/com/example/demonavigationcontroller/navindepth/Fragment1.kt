package com.example.demonavigationcontroller.navindepth

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.demonavigationcontroller.R
import kotlinx.android.synthetic.main.fragment1.view.*

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment1, null)

        view.container.setBackgroundColor(Color.parseColor("#550000ff"))
        view.info.setText(R.string.fragment1)
        view.navigate.setOnClickListener {
            findNavController().navigate(R.id.action_fragment1_to_fragment2, null)
        }

        return view
    }
}