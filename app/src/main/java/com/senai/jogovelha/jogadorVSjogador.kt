package com.senai.jogovelha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView

var contador: Int = 0;
var jogadorcct1 = 0;
var jogadorcct2 = 0;
var jogador = 1;
var contr: Int = 0;

class jogadorVSjogador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogador_vsjogador)


        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)


        val btnList = arrayListOf<Button>(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)


        btnList.forEach {
            it.setOnClickListener { tdo(it as Button) }
        }


//        for (x in 0..btnList.size-1 ){
//            btnList[x].setOnClickListener { tdo(it as Button) }
//        }

    }


    private fun tdo(btn: Button) {
        val result = findViewById<TextView>(R.id.result)

        if (jogador == 1) {
            btn.setText("x")
            btn.textSize = 80f
            btn.setEnabled(false)
            jogador = 2
        }else if(jogador == 2){
            btn.setText("o")
            btn.textSize = 80f
            btn.setEnabled(false)
            jogador = 1
        }



    }



    }



