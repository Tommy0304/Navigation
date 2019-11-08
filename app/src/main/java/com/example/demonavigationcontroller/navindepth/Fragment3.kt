package com.example.demonavigationcontroller.navindepth

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.demonavigationcontroller.R
import kotlinx.android.synthetic.main.fragment3.view.*

class Fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment3, null)

        view.container.setBackgroundColor(Color.parseColor("#ff0000ff"))
        view.info.setText(R.string.fragment3)
        view.navigate.setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragmentList, null)
        }

        return view
    }
}