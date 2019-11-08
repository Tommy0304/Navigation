package com.example.demonavigationcontroller.viewpager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.demonavigationcontroller.R
import com.example.demonavigationcontroller.setGone
import kotlinx.android.synthetic.main.activity_view_pager2.*
import kotlinx.android.synthetic.main.fragment1.view.*

class ViewPager2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager2)

        var currentMenuItem = bottom_nav_view.menu.getItem(0)
        view_pager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)

                if (currentMenuItem != null)
                    currentMenuItem.isChecked = false
                else
                    bottom_nav_view.menu.getItem(0).isChecked = false

                bottom_nav_view.menu.getItem(position).isChecked = true
                currentMenuItem = bottom_nav_view.menu.getItem(position)
            }

        })

        // list must have 3 items
        val list = arrayListOf("A", "B", "C")

        val adapter = ViewPager2Adapter()
        view_pager2.adapter = adapter
        adapter.setData(list)

        bottom_nav_view.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.fragmentHome -> view_pager2.currentItem = 0
                R.id.fragmentPeople -> view_pager2.currentItem = 1
                R.id.fragmentAlbum -> view_pager2.currentItem = 2
            }
            false
        }
    }

    inner class ViewPager2Adapter : RecyclerView.Adapter<ViewPager2Adapter.ViewHolder>() {

        var arrayList: ArrayList<String> = ArrayList()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val v = layoutInflater.inflate(R.layout.fragment1, parent, false)
            return ViewHolder(v)
        }

        override fun getItemCount(): Int {
            return arrayList.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            arrayList.let {
                holder.onBindView(it[position])
            }

        }

        fun setData(array: ArrayList<String>) {
            arrayList.apply {
                clear()
                addAll(array)
                if (size > 0) {
                    notifyDataSetChanged()
                }
            }
        }

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

            fun onBindView(commonData: String) {
                itemView.apply {
                    info?.text = commonData

                    navigate.text = "Change Text"
                    navigate.setOnClickListener {
                        info.text = "Text Changed"
                    }
                }
            }
        }
    }
}
