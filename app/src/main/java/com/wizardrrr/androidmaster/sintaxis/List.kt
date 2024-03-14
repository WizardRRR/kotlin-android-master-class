package com.wizardrrr.androidmaster.sintaxis

fun main(){
    inmutableList()
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes", "Miercoles", "Jueves","Viernes","Sabado", "Domingos")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    // Filtrar
    val example = readOnly.filter { it.contains("a") }

    // Iterar
    readOnly.forEach { weekDay -> println(weekDay)}
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes","Martes", "Miercoles", "Jueves","Viernes","Sabado", "Domingos")

    weekDays.add(0,"Wizard")

    if (weekDays.isEmpty()) {
        // none
    } else {
        weekDays.forEach { println(it)}
    }

    if (weekDays.isNotEmpty()) {
        weekDays.forEach { println(it)}
    }

    for (weekDay in weekDays) {
        println(weekDay)
    }
}