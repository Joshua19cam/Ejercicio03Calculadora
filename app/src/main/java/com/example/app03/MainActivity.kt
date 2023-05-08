package com.example.app03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomappbar.BottomAppBar

class MainActivity : AppCompatActivity() {
    var operacion: Int = 0
    var numero1: Double = 0.0
    var numero2: Double = 0.0
    lateinit var pantalla1: TextView
    lateinit var pantalla2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pantalla1 = findViewById(R.id.textView2)
        pantalla2 = findViewById(R.id.textView3)
        val btnBorrarTodo: Button = findViewById(R.id.buttonBorrarTodo)
        val btnIgual: Button = findViewById(R.id.buttonIgual)

        btnBorrarTodo.setOnClickListener {
            pantalla1.setText("")
            pantalla2.setText("")
        }
        btnIgual.setOnClickListener {
            pantalla2.setText("")
            numero2 = pantalla1.text.toString().toDouble()
            val x = Calculadora.accion(numero1,numero2,operacion)
            pantalla1.setText(x.toString())

        }

    }
    fun presionarDigito(view: View){
        //val pantalla: TextView = findViewById(R.id.textView2)
        var num2 : String = pantalla1.text.toString()

        when(view.id){
            R.id.button0 -> pantalla1.setText(num2+"0")
            R.id.button1 -> pantalla1.setText(num2+"1")
            R.id.button2 -> pantalla1.setText(num2+"2")
            R.id.button3 -> pantalla1.setText(num2+"3")
            R.id.button4 -> pantalla1.setText(num2+"4")
            R.id.button5 -> pantalla1.setText(num2+"5")
            R.id.button6 -> pantalla1.setText(num2+"6")
            R.id.button7 -> pantalla1.setText(num2+"7")
            R.id.button8 -> pantalla1.setText(num2+"8")
            R.id.button9 -> pantalla1.setText(num2+"9")

            R.id.buttonPunto -> pantalla1.setText(num2+".")
            R.id.buttonBorrar -> pantalla1.setText(num2.dropLast(1))
            R.id.buttonPorcentaje -> pantalla1.setText((num2.toDouble() * .01).toString())
        }
    }
    fun presionarOperacion(view: View){
        numero1 = pantalla1.text.toString().toDouble()
        var num2_text: String = pantalla1.text.toString()
        pantalla1.setText("")
        when(view.id){
            R.id.buttonSuma ->{
                pantalla2.setText(num2_text+"+")
                operacion = 1
            }
            R.id.buttonResta ->{
                pantalla2.setText(num2_text+"-")
                operacion = 2
            }
            R.id.buttonMulti ->{
                pantalla2.setText(num2_text+"*")
                operacion = 3
            }
            R.id.buttonDiv ->{
                pantalla2.setText(num2_text+"/")
                operacion = 4
            }
        }
    }

}
