package com.github.boybeak.gifhelper

import android.graphics.Bitmap
import android.support.rastermill.FrameSequence
import android.support.rastermill.FrameSequenceDrawable
import com.bumptech.glide.load.ImageHeaderParser
import com.bumptech.glide.load.Options
import com.bumptech.glide.load.ResourceDecoder
import com.bumptech.glide.load.engine.Resource
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser
import com.bumptech.glide.load.resource.gif.GifBitmapProvider
import com.bumptech.glide.load.resource.gif.GifOptions
import java.io.InputStream

class GifDecoder(bmpPool: BitmapPool, arrayPool: ArrayPool) : ResourceDecoder<InputStream, FrameSequenceDrawable> {

    private val headerParser = DefaultImageHeaderParser()
    private val gifBitmapPool = GifBitmapProvider(bmpPool, arrayPool)
    private val provider = object : FrameSequenceDrawable.BitmapProvider {
        override fun acquireBitmap(minWidth: Int, minHeight: Int): Bitmap {
            return gifBitmapPool.obtain(minWidth, minHeight, Bitmap.Config.ARGB_8888)
        }

        override fun releaseBitmap(bitmap: Bitmap?) {
            bitmap ?: return
            return gifBitmapPool.release(bitmap)
        }
    }

    override fun handles(source: InputStream, options: Options): Boolean {
        return !(options.get(GifOptions.DISABLE_ANIMATION) ?: true)
            && headerParser.getType(source) == ImageHeaderParser.ImageType.GIF
    }

    override fun decode(
        source: InputStream,
        width: Int,
        height: Int,
        options: Options
    ): Resource<FrameSequenceDrawable>? {
        val fs = FrameSequence.decodeStream(source)
        val fsd = FrameSequenceDrawable(fs, provider)
        return GifResource(fsd)
    }
}