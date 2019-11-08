package com.example.demonavigationcontroller.navindepth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.demonavigationcontroller.R
import com.example.demonavigationcontroller.setGone
import kotlinx.android.synthetic.main.fragment_list.view.*

class FragmentList : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, null)

        view.info.setText(R.string.dead_end)
        view.recycler_view.setGone()

        return view
    }
}