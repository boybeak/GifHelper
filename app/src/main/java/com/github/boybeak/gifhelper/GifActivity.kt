package com.github.boybeak.gifhelper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.github.boybeak.gifhelper.adapter.GifAdapter

class GifActivity : AppCompatActivity() {
    private val adapter = GifAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gif)

        findViewById<RecyclerView>(R.id.gifRV).adapter = adapter

        if (intent.getBooleanExtra("use_gifx", false)) {
            adapter.showGifX()
        } else {
            adapter.showGif()
        }
    }
}