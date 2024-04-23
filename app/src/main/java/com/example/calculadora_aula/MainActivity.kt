package com.example.calculadora_aula

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import android.widget.Toast

class MainActivity : AppCompatActivity() {
     var num1 = 0
     var num2 = 0
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valorUm = findViewById<TextView>(R.id.valores)
        val valorDois = findViewById<TextView>(R.id.valores2)
        val operador = findViewById<TextView>(R.id.operadores)
        val resultado = findViewById<TextView>(R.id.resultado)
        var calculo: Int

        val botaoCE = findViewById<Button>(R.id.ce)
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
        val botaoLimpar = findViewById<ImageButton>(R.id.Limpar)
        val botaoDivisao = findViewById<Button>(R.id.divisao)
        val botaoMultiplicacao = findViewById<Button>(R.id.multiplicacao)
        val botaoSubtracao = findViewById<Button>(R.id.subtracao)
        val botaoSoma = findViewById<Button>(R.id.soma)
        val botaoPonto = findViewById<Button>(R.id.ponto)
        val botaoIgual = findViewById<Button>(R.id.igual)


        botaoLimpar.setOnClickListener {
            if (operador.text == "") {
                if (valorUm.text != ""){
                    valorUm.text = valorUm.text.dropLast(1)
                    if(valorUm.text != ""){
                        num1 = (valorUm.text as String).toInt()
                    }else
                        num1 = 0
                }
            }else if (operador.text != "") {
                if (valorDois.text != "") {
                    valorDois.text = valorDois.text.dropLast(1)
                    if(valorDois.text != ""){
                        num2 = (valorDois.text as String).toInt()
                    }else
                        num2 = 0
                }else if(valorDois.text == ""){
                    operador.text = ""
                }
            }
        }

            botaoPonto.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}."
                    num1 = (valorUm.text as String).toInt()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}."
                    num2 = (valorDois.text as String).toInt()
                }
            }

            botaoIgual.setOnClickListener {
                when (operador.text) {
                    "+" -> {
                        calculo = (num1 + num2)
                        resultado.text = (calculo).toString()
                    }
                    "-" -> {
                        calculo = (num1 - num2)
                        resultado.text = (calculo).toString()
                    }
                    "*" -> {
                        calculo = (num1 * num2)
                        resultado.text = (calculo).toString()
                    }
                    "/" -> {
                        calculo = (num1 / num2)
                        resultado.text = (calculo).toString()
                    }
                }
            }

            botaoZero.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}0"
                    num1 = (valorUm.text as String).toInt()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}0"
                    num2 = (valorDois.text as String).toInt()
                }
            }
            botaoUm.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}1"
                    num1 = (valorUm.text as String).toInt()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}1"
                    num2 = (valorDois.text as String).toInt()
                }
            }
            botaoDois.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}2"
                    num1 = (valorUm.text as String).toInt()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}2"
                    num2 = (valorDois.text as String).toInt()
                }
            }
            botaoTres.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}3"
                    num1 = (valorUm.text as String).toInt()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}3"
                    num2 = (valorDois.text as String).toInt()
                }
            }
            botaoQuatro.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}4"
                    num1 = (valorUm.text as String).toInt()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}4"
                    num2 = (valorDois.text as String).toInt()
                }
            }
            botaoCinco.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}5"
                    num1 = (valorUm.text as String).toInt()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}5"
                    num2 = (valorDois.text as String).toInt()
                }
            }
            botaoSeis.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}6"
                    num1 = (valorUm.text as String).toInt()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}6"
                    num2 = (valorDois.text as String).toInt()
                }
            }
            botaoSete.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}7"
                    num1 = (valorUm.text as String).toInt()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}7"
                    num2 = (valorDois.text as String).toInt()
                }
            }
            botaoOito.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}8"
                    num1 = (valorUm.text as String).toInt()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}8"
                    num2 = (valorDois.text as String).toInt()
                }
            }
            botaoNove.setOnClickListener {
                if (operador.text == "") {
                    valorUm.text = "${valorUm.text}9"
                    num1 = (valorUm.text as String).toInt()
                } else if (operador.text != "") {
                    valorDois.text = "${valorDois.text}9"
                    num2 = (valorDois.text as String).toInt()
                }
            }

            botaoCE.setOnClickListener {
                valorUm.text = ""
                valorDois.text = ""
                operador.text = ""
                resultado.text = ""
            }
            botaoDivisao.setOnClickListener {
                operador.text = ""
                operador.text = "/"
                if(valorUm.text != ""){
                    if(valorDois.text != ""){
                        valorUm.text = resultado.text
                        num1 = (valorUm.text as String).toInt()
                        operador.text = "/"
                        valorDois.text = ""
                        resultado.text = ""
                    }
                }
            }
            botaoMultiplicacao.setOnClickListener {
                operador.text = ""
                operador.text = "*"
                if(valorUm.text != ""){
                    if(valorDois.text != ""){
                        valorUm.text = resultado.text
                        num1 = (valorUm.text as String).toInt()
                        operador.text = "*"
                        valorDois.text = ""
                        resultado.text = ""
                    }
                }
            }
            botaoSubtracao.setOnClickListener {
                operador.text = ""
                operador.text = "-"
                if(valorUm.text != ""){
                    if(valorDois.text != ""){
                        valorUm.text = resultado.text
                        num1 = (valorUm.text as String).toInt()
                        operador.text = "-"
                        valorDois.text = ""
                        resultado.text = ""
                    }
                }
            }
            botaoSoma.setOnClickListener {
                operador.text = ""
                operador.text = "+"
                if(valorUm.text != ""){
                    if(valorDois.text != ""){
                        valorUm.text = resultado.text
                        num1 = (valorUm.text as String).toInt()
                        operador.text = "+"
                        valorDois.text = ""
                        resultado.text = ""
                    }
                }

            }

    }
}
/*
botaoIgual.setOnClickListener {
                if (operador.text == "+") {
                    calculo = (num1 + num2)
                    resultado.text = (calculo).toString()
                } else if (operador.text == "-") {
                    calculo = (num1 - num2)
                    resultado.text = (calculo).toString()
                } else if (operador.text == "*") {
                    calculo = (num1 * num2)
                    resultado.text = (calculo).toString()
                } else if (operador.text == "/") {
                    calculo = (num1 / num2)
                    resultado.text = (calculo).toString()
                }
            }
 */

