package com.github.boybeak.gifhelper.adapter

import com.github.boybeak.adapter.AbsItem
import com.github.boybeak.adapter.ItemImpl
import com.github.boybeak.gifhelper.R

class GifItem(gif: String, val useGifX: Boolean = false) : AbsItem<String>(gif) {

    /*fun getUri(): Uri {
        return Uri.parse("file:///android_asset/${source()}")
    }*/

    override fun layoutId(): Int {
        return R.layout.item_gif
    }

    override fun holderClass(): Class<GifHolder> {
        return GifHolder::class.java
    }

    override fun areContentsSame(other: ItemImpl<*>): Boolean {
        return source() == other.source()
    }
}