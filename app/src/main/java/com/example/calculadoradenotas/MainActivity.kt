package com.example.calculadoradenotas

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
        val resultado : TextView = resultado

        bt_calcular.setOnClickListener {

            val nota1 : Int = Integer.parseInt(nota1.text.toString())
            val nota2 : Int = Integer.parseInt(nota2.text.toString())
            val faltas : Int = Integer.parseInt(faltas.text.toString())

            val media : Int = mediaAluno (nota1, nota2)

            resultadoAluno(media, faltas)

        }
    }

    fun mediaAluno (nota1 : Int, nota2: Int ) : Int { return (nota1 + nota2)/2 }

    fun resultadoAluno (media : Int, faltas : Int) {

        if (media >= 6 && faltas <= 10){
            resultado.setText("Aluno foi aprovado com nota " + media + " e faltas " + faltas)
        }
        else{
            resultado.setText("Aluno foi reprovado com nota " + media + " e faltas " + faltas)
        }
    }

}