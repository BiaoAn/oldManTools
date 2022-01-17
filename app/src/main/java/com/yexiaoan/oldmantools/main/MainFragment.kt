package com.yexiaoan.oldmantools.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.yexiaoan.oldmantools.R

/**
 * 首页Fragment
 */
class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val viewPager2: ViewPager2 = view.findViewById(R.id.vp);
        val adapter = VpAdapter(context)
        viewPager2.adapter = adapter
        return view
    }
}