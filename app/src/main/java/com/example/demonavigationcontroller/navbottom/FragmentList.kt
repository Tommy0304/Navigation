package com.example.demonavigationcontroller.navbottom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.demonavigationcontroller.MyAdapter
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

        view.recycler_view.adapter = MyAdapter(30)
        view.info.setGone()

        return view
    }

}