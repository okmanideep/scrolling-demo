package com.manidesto.scrollingdemo.ui.scrolling

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.manidesto.scrollingdemo.R
import com.manidesto.scrollingdemo.ui.commons.FakeAdapter
import com.manidesto.scrollingdemo.ui.commons.inflate

class SectionAdapter : RecyclerView.Adapter<SectionAdapter.ViewHolder>() {
    val DEFAULT_COUNT = 10

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder? {
        return ViewHolder(parent!!.inflate(R.layout.item_section))
    }

    override fun getItemCount() = DEFAULT_COUNT

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var rvHorizontal : RecyclerView
        lateinit var layoutManager : LinearLayoutManager
        init {
            rvHorizontal = itemView.findViewById(R.id.rv_horizontal) as RecyclerView
            layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)

            rvHorizontal.layoutManager = layoutManager
            rvHorizontal.adapter = FakeAdapter(R.layout.item_card_hor)
        }

        fun bind() {
            layoutManager.scrollToPosition(0)
        }
    }
}