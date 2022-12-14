package com.D121201067.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.tambahCatatan)

        btnIntent.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.tambahCatatan -> {
                val intentBiasa = Intent(this@MainActivity, AddActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }

}