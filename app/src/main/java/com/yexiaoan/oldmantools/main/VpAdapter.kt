package com.yexiaoan.oldmantools.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yexiaoan.oldmantools.R

class VpAdapter(ctx: Context?) : RecyclerView.Adapter<VpAdapter.HorizontalVpViewHolder>() {
    private var backgrounds: ArrayList<Int>? = null
    private var context: Context? = null

    init {
        this.context = ctx
        if (backgrounds == null) {
            backgrounds = ArrayList()
            backgrounds?.add(android.R.color.holo_blue_bright)
            backgrounds?.add(android.R.color.holo_red_dark)
            backgrounds?.add(android.R.color.holo_green_dark)
            backgrounds?.add(android.R.color.holo_orange_light)
            backgrounds?.add(android.R.color.holo_purple)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalVpViewHolder {
        return HorizontalVpViewHolder(LayoutInflater.from(context).inflate((R.layout.itemview), parent, false));
    }

    override fun onBindViewHolder(holder: HorizontalVpViewHolder, position: Int) {
        val msg = "第  " + (position + 1) + " 界面"
        holder.mTextView?.text = msg
        val res: Int? = backgrounds?.get(position)
        if (res != null) {
            holder.mLinearLayout?.setBackgroundColor(res)
        }
    }

    override fun getItemCount(): Int {
        if (backgrounds == null) {
            return 0
        }
        return backgrounds!!.size
    }

    class HorizontalVpViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mLinearLayout: LinearLayout? = null
        var mTextView: TextView? = null

        init {
            mLinearLayout = itemView.findViewById(R.id.item_llv)
            mTextView = itemView.findViewById(R.id.item_tv)
        }
    }
}
