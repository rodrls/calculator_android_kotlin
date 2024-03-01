package com.example.calculadora_aula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/*import com.example.calculadora_aula.databinding.ActivityMainBinding*/

class MainActivity : AppCompatActivity() {

    /* Classe private criada para iniciar o Binding*/
    /*private lateinit var binding: ActivityMainBinding*/
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        /* Iniciando o BINDING na MAIN ACTIVITY*/
        /*binding = ActivityMainBinding.inflate(layoutInflater)*/
        setContentView(R.layout.activity_main)

        val valores = findViewById<TextView>(R.id.valores)

        val botaoUm = findViewById<Button>(R.id.num1)
        val botaoDois = findViewById<Button>(R.id.num2)
        val botaoTres = findViewById<Button>(R.id.num3)
        val botaoQuatro = findViewById<Button>(R.id.num4)
        val botaoCinco = findViewById<Button>(R.id.num5)
        val botaoSeis = findViewById<Button>(R.id.num6)
        val botaoSete = findViewById<Button>(R.id.num7)
        val botaoOito = findViewById<Button>(R.id.num8)
        val botaoNove = findViewById<Button>(R.id.num9)
        val botaoZero = findViewById<Button>(R.id.num0)
        val botaoCE = findViewById<Button>(R.id.ce)

        botaoCE.setOnClickListener{
            valores.text = ""
        }
        botaoZero.setOnClickListener{
            valores.text = "${valores.text}0"
        }
        botaoUm.setOnClickListener{
            valores.text = "${valores.text}1"
        }
        botaoDois.setOnClickListener{
            valores.text = "${valores.text}2"
        }

        botaoTres.setOnClickListener{
            valores.text = "${valores.text}3"
        }
        botaoQuatro.setOnClickListener{
            valores.text = "${valores.text}4"
        }
        botaoCinco.setOnClickListener{
            valores.text = "${valores.text}5"
        }
        botaoSeis.setOnClickListener{
            valores.text = "${valores.text}6"
        }
        botaoSete.setOnClickListener{
            valores.text = "${valores.text}7"
        }
        botaoOito.setOnClickListener{
            valores.text = "${valores.text}8"
        }
        botaoNove.setOnClickListener{
            valores.text = "${valores.text}9"
        }

    }
}