package com.senai.jogovelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val oneplayer = findViewById<Button>(R.id.oneplayer)
        oneplayer.setOnClickListener{chamanadoframeoneplayer(oneplayer)}

        val twoplayer = findViewById<Button>(R.id.twoplayers)
        twoplayer.setOnClickListener{chamanadoframeuserVSuser(twoplayer)}

            
}

    private fun chamanadoframeoneplayer(oneplayer : Button){
       val segundaFrame = Intent(this, jogovelhaframe2::class.java)

        startActivity(segundaFrame)

    }


    private fun chamanadoframeuserVSuser(twoplayer : Button){
        val userFrame= Intent(this, jogadorVSjogador::class.java)

        startActivity(userFrame)

    }


}