package com.github.boybeak.gifhelper.gif

import android.support.rastermill.FrameSequenceDrawable
import com.bumptech.glide.load.engine.Resource

class GifResource(private val fsd: FrameSequenceDrawable) : Resource<FrameSequenceDrawable> {
    override fun getResourceClass(): Class<FrameSequenceDrawable> {
        return FrameSequenceDrawable::class.java
    }

    override fun get(): FrameSequenceDrawable {
        return fsd
    }

    override fun getSize(): Int {
        return 0
    }

    override fun recycle() {
        fsd.stop()
        fsd.destroy()
    }
}