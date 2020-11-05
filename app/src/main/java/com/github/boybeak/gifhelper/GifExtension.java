package com.github.boybeak.gifhelper;

import android.support.rastermill.FrameSequenceDrawable;

import androidx.annotation.NonNull;

import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideType;
import com.bumptech.glide.request.RequestOptions;

@GlideExtension
public class GifExtension {
    @NonNull
    @GlideType(FrameSequenceDrawable.class)
    public static RequestBuilder<FrameSequenceDrawable> asGifX(RequestBuilder<FrameSequenceDrawable> requestBuilder) {
        return requestBuilder.apply(RequestOptions
                .decodeTypeOf(FrameSequenceDrawable.class)
                .lock());
    }
    private GifExtension(){}
}
