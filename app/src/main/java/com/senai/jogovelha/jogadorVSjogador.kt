package com.senai.jogovelha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible


var jogador = 1;


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
            it.setOnClickListener { jogoclick(it as Button) }
        }


//        for (x in 0..btnList.size-1 ){
//            btnList[x].setOnClickListener { tdo(it as Button) }
//        }

    }


    private fun jogoclick(btn: Button) {




        val vezjogador = findViewById<TextView>(R.id.vez)


        if (jogador == 1) {
            vezjogador.text = "vez do jogador 2"

            btn.text = "x"
            btn.textSize = 80f
            btn.isClickable = false
            jogador = 2;



        } else if (jogador == 2) {
            vezjogador.text = "vez do jogador 1"
            btn.text = "o"
            btn.textSize = 80f

            btn.isClickable = false
            jogador = 1;

        }


        val resete = findViewById<TextView>(R.id.reset)





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

        if (btnList[0].text == "x" && btnList[1].text == "x" && btnList[2].text == "x" || btnList[0].text == "x" && btnList[3].text == "x" && btnList[6].text == "x"){
            ganhador();
            endgame(btnList);
            resete.isVisible = true;
            resete.setOnClickListener { reset(btnList) }


        }else if (btnList[3].text == "x" && btnList[4].text == "x" && btnList[5].text == "x" || btnList[1].text == "x" && btnList[5].text == "x" && btnList[8].text == "x"){
            ganhador();
            endgame(btnList);
            resete.isVisible = true;
            resete.setOnClickListener { reset(btnList) };


        }else if(btnList[6].text == "x" && btnList[7].text == "x" && btnList[8].text == "x" || btnList[2].text == "x" && btnList[6].text == "x" && btnList[9].text == "x"){
            ganhador();
            endgame(btnList);
            resete.isVisible = true;
            resete.setOnClickListener { reset(btnList)
             btnList[1].isClickable =true;
            }

        }else if (btnList[0].text == "x" && btnList[4].text == "x" && btnList[8].text == "x"){
            ganhador();
            endgame(btnList);
            resete.isVisible = true;
            resete.setOnClickListener { reset(btnList) }

        }else if(btnList[2].text == "x" && btnList[4].text == "x" && btnList[6].text == "x"){

            ganhador();
            endgame(btnList);
            resete.isVisible = true;
            resete.setOnClickListener { reset(btnList) }

        }else if(btnList[0].text == "o" && btnList[1].text == "o" && btnList[2].text == "o" || btnList[0].text == "o" && btnList[3].text == "o" && btnList[6].text == "o"){
            ganhador();
            endgame(btnList);
            resete.isVisible = true;
            resete.setOnClickListener { reset(btnList) }
        }






    }

    private fun endgame(bntlist : ArrayList<Button>) {


        for(x in 0..bntlist.size-1){
            bntlist[x].isClickable = false
        }
    }


    private fun ganhador() {
        val result = findViewById<TextView>(R.id.result)
        if (jogador == 1) {
            result.text = "Ganhador: 0"

        } else {
            result.text = "Ganhador: x"
        }

    }

    private fun empate(btnlist: ArrayList<Button>){
        val result = findViewById<TextView>(R.id.result)
        if(btnlist.size != 0){
            result.text = "empate"
        }

    }

    private  fun reset(btns:ArrayList<Button>){
        val result = findViewById<TextView>(R.id.result)

        jogador = 1;
        result.text = "user : 0   VS   0 : user2";

        btns.forEach {
            it.text = ""
            it.isClickable = true

        }

    }
}







