package com.github.boybeak.gifhelper

import android.support.rastermill.FrameSequenceDrawable
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.github.boybeak.adapter.AbsHolder
import com.github.boybeak.adapter.AnyAdapter

class GifHolder(v: View) : AbsHolder<GifItem>(v) {
    private val gifIV = view<ImageView>(R.id.gifIV)
    override fun onBind(item: GifItem, position: Int, absAdapter: AnyAdapter) {
        if (item.useGifX) {
            GlideApp.with(itemView).asGifX().load(item.source()).into(gifIV)
        } else {
            Glide.with(itemView).load(item.source()).into(gifIV)
        }
    }

}