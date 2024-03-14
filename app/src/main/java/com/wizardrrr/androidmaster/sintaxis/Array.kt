package com.wizardrrr.androidmaster.sintaxis

fun main(){
    val weekDays = arrayOf("Lunes","Martes", "Miercoles", "Jueves","Viernes","Sabado", "Domingos")

    // Bucles para arrays

    for (index in weekDays.indices) {
        println(weekDays[index])
    }

    for((index , value) in weekDays.withIndex()){
        println("La posición $index contiene el valor $value")
    }

    for(weekDay in weekDays){
        println("Elemento $weekDay ")
    }
}