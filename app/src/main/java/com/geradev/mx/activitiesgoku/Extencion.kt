package com.geradev.mx.activitiesgoku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.transformacionSS2(fase: Int) {
    startActivity(Intent(this, GokuSS2::class.java).apply {
        this.putExtra("fase", fase) //con putEstra se manda paramtrso serializables
    })
}

