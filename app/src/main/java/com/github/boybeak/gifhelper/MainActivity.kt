package com.github.boybeak.gifhelper

import android.content.Intent
import android.os.*
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import androidx.appcompat.widget.AppCompatCheckBox

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onGoClick(v: View) {
        /*startActivity(Intent(this, GifActivity::class.java)
            .putExtra("use_gifx", findViewById<AppCompatCheckBox>(R.id.useGifXCB).isChecked)
        )*/
    }

}