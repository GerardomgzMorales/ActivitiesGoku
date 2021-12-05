package com.geradev.mx.activitiesgoku

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_goku_s_s2.*

class GokuSS2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goku_s_s2)

        val fases = intent.getIntExtra("fase", 1)

        imagenGoku(fases)

        if (fases < 4) {
            idImgGokuSS2.setOnClickListener {
                transformacionSS2(fases + 1)
            }
        } else {
            idImgGokuSS2?.setImageResource(R.drawable.img_goku)
        }
    }

    private fun imagenGoku(fases: Int) {
        when (fases) {
            0 -> {
                idImgGokuSS2?.setImageResource(R.drawable.img_goku)
            }
            1 -> {
                idImgGokuSS2?.setImageResource(R.drawable.img_goku_ss1)
            }
            2 -> {
                idImgGokuSS2?.setImageResource(R.drawable.img_goku_ss2)
            }
            3 -> {
                idImgGokuSS2?.setImageResource(R.drawable.img_goku_ss3)
            }
            4 -> {
                idImgGokuSS2?.setImageResource(R.drawable.img_goku_ss4)
            }

        }
    }


}