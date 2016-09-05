package com.manidesto.scrollingdemo.ui.scrolling

import android.content.Context
import android.util.AttributeSet
import com.manidesto.scrollingdemo.ui.commons.BetterRecyclerView


class FeedRootRecyclerView : BetterRecyclerView{
    constructor(context : Context?) : this(context, null){}

    constructor(context: Context?, attrs : AttributeSet?) : this(context, attrs, 0){}

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr : Int) : super(context, attrs, defStyleAttr) {}

    override fun requestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {
        // do nothing
    }
}