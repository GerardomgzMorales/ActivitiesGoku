package com.geradev.mx.activitiesgoku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class GokuSS3 : AppCompatActivity() {

    private lateinit var gokuSS3Img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goku_s_s3)

        gokuSS3Img = findViewById(R.id.IdImgGokuss3)

        gokuSS3Img.setOnClickListener {
            transformacionSS4()
        }

    }

    private fun transformacionSS4() {
        startActivity(Intent(this, GokuSS4::class.java))
    }

}