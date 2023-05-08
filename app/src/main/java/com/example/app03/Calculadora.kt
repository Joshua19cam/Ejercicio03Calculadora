package com.example.app03

class Calculadora (){

    companion object {

        fun accion(numero1: Double, numero2: Double,x: Int) : Double{
            var resultado = 0.0
            when(x){
                1 -> resultado = numero1 + numero2
                2 -> resultado = numero1 - numero2
                3 -> resultado = numero1 * numero2
                4 -> resultado = numero1 / numero2
            }
            return resultado
        }
    }
}