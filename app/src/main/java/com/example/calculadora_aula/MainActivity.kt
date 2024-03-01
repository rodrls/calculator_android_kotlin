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

        /* PARA USAR o BINDING na MAIN ACTIVITY*/
        /*binding = ActivityMainBinding.inflate(layoutInflater)*/

        setContentView(R.layout.activity_main)

        val valores = findViewById<TextView>(R.id.valores)
        /*
        val valor2 = findViewById<TextView>(R.id.valor2)
        val OP = findViewById<TextView>(R.id.operador)
        */
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

        /*
        val botaoDivisao = findViewById<Button>(R.id.divisao)
        val botaoMultiplicacao= findViewById<Button>(R.id.multiplicacao)
        val botaoSubtracao = findViewById<Button>(R.id.subtracao)
        val botaoSoma = findViewById<Button>(R.id.soma)
        */
        /*
        val botaoPonto = findViewById<Button>(R.id.ponto)
        val botaoIgual = findViewById<Button>(R.id.igual)
        val botaoLimpar = findViewById<Button>(R.id.Limpar)
        */

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

        /*
        botaoDivisao.setOnClickListener{
            OP.text = "${OP.text}/"
        }
        botaoMultiplicacao.setOnClickListener{
            OP.text = "${OP.text}*"
        }
        botaoSubtracao.setOnClickListener{
            OP.text = "${OP.text}-"
        }
        botaoSoma.setOnClickListener{
            OP.text = "${OP.text}+"
        }
        */

        /*
        <TextView
        android:id="@+id/operador"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:textSize="35sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.523"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.202"
        tools:text="OP" />

    <TextView
        android:id="@+id/valor2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="200dp"
        android:layout_marginTop="10dp"
        android:textSize="35sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.674"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.202"
        tools:text="VALOR2" />

    */

    }
}