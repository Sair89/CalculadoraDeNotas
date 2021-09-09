package com.example.calculadoradenotas

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt_Calcular : Button = bt_calcular


        bt_Calcular.setOnClickListener {

            val nota1 : Int = Integer.parseInt(nota1.text.toString())
            val nota2 : Int = Integer.parseInt(nota2.text.toString())
            val faltas : Int = Integer.parseInt(faltas.text.toString())

            val media : Int = mediaAluno (nota1, nota2)

            resultadoAluno(media, faltas)

        }
    }

    fun mediaAluno (nota1 : Int, nota2: Int ) : Int { return (nota1 + nota2)/2 }

    fun resultadoAluno (media : Int, faltas : Int) {

        val result : TextView = resultado

        if (media >= 6 && faltas <= 10){
            result.setText("Aluno foi aprovado!" +"\n" + "Nota: " + media + "\n" + "Faltas: " + faltas + "\n")
            result.setTextColor(Color.GREEN)
        }
        else{
            result.setText("Aluno foi reprovado!" +"\n" + "Nota: " + media + "\n" + "Faltas: " + faltas + "\n")
            result.setTextColor(Color.RED)
        }
    }

}