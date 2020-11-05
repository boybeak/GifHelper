package com.github.boybeak.gifhelper.adapter

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.github.boybeak.adapter.AbsHolder
import com.github.boybeak.adapter.AnyAdapter
import com.github.boybeak.gifhelper.R
import com.github.boybeak.gifhelper.gif.GlideApp

class GifHolder(v: View) : AbsHolder<GifItem>(v) {

    companion object {
        private val BG_COLORS = arrayOf(
            android.R.color.holo_blue_bright, android.R.color.holo_green_dark,
            android.R.color.holo_orange_dark, android.R.color.holo_purple,
            android.R.color.holo_red_dark)
    }

    private val gifIV = view<ImageView>(R.id.gifIV)
    override fun onBind(item: GifItem, position: Int, absAdapter: AnyAdapter) {
        if (item.useGifX) {
            GlideApp.with(itemView).asGifX().load(item.source()).into(gifIV)
        } else {
            Glide.with(itemView).load(item.source()).into(gifIV)
        }
        itemView.setBackgroundColor(context().getColor(BG_COLORS[position % BG_COLORS.size]))
    }

}