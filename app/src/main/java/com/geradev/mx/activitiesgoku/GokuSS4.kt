package com.geradev.mx.activitiesgoku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class GokuSS4 : AppCompatActivity() {

    private lateinit var gokuSS4Img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goku_s_s4)

        gokuSS4Img = findViewById(R.id.IdImgGoku4)

        gokuSS4Img.setOnClickListener {
            transofrmacionGoku5()
        }

    }

    private fun transofrmacionGoku5() {
        startActivity(Intent(this, GokuSS5::class.java))
    }

}