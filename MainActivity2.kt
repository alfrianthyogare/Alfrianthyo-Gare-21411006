package com.example.thio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnIntent = findViewById(R.id.btnKembali)

        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnKembali -> run {
                val intentBiasa = Intent(this@MainActivity2, MainActivity2::class.java)
                val intentBack = null
                startActivity(intentBack)
            }
        }
    }


}
