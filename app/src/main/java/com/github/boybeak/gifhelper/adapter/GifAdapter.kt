package com.github.boybeak.gifhelper.adapter

import com.github.boybeak.adapter.AnyAdapter

class GifAdapter : AnyAdapter() {

    companion object {
        private val GIF_ARRAY = listOf<String>(
            "https://img.youxiniao.com/uploads/allimg/150923/43-1509231H147.gif",
            "https://p3.pstatp.com/large/31bd000503203b31565f",
            "https://p3.pstatp.com/large/12d60007b5c6b62f101a"/*,
            "https://photocdn.sohu.com/20150804/mp25534119_1438650187134_6.gif",
            "https://5b0988e595225.cdn.sohucs.com/images/20180313/b2fa7b164c7b4782b1f05111795e37e9.gif",
            "https://img2.utuku.china.com/uploadimg/ent/20190311/1ec8301f-6b32-4d14-8587-0bc54e8b9a7f.gif",
            "https://tva3.sinaimg.cn/mw690/0072Mb4Nly1fpm3nl38m8g306w078npd.gif",
            "https://p3.pstatp.com/large/46ef0002977178f119c9",
            "https://tva1.sinaimg.cn/mw690/7fc13627gy1fct998h7rhg20a0061e81.gif",
            "https://p1.pstatp.com/large/pgc-image/94e5ebe648fa41aab05f55f6995fff32",*/
        )
    }

    fun showGif() {
        addAll(GIF_ARRAY) { s, i ->
            GifItem(s)
        }
    }
    fun showGifX() {
        addAll(GIF_ARRAY) { s, i ->
            GifItem(s, true)
        }
    }
}