package com.wizardrrr.androidmaster.sintaxis

/*
* Variables
* */
fun main() {
    numericalVariables()
    alphanumericVariables()
    booleanVariables()

    showMyName("Royer")
    showMyAge(30)
}

fun numericalVariables() {
    /**
     * Variables númericas
     */

    //Int -2,147,483,647 a 2,147,483,647
    val age: Int = 1

    // Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example: Long = 92382383282388

    //Float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 321.232

}

fun alphanumericVariables() {

    /**
     * Variables Alfanúmericas
     */

    //Char
    val charExample: Char = 'A'
    val charExample1: Char = '@'
    val charExample2: Char = '2'

    //String
    val stringExample: String = "WizardRRR"


}

fun booleanVariables() {
    /**
     * Variables Booleanas
     */

    //Boolean
    val booleanExample: Boolean = true
}

fun showMyName(name: String = "Royer") {
    println("Me llamo $name")
}

fun showMyAge(currentAge: Int) {
    println("Tengo 10 $currentAge")
}

fun suma(n1:Int,n2:Int):Int {
    println(n1 + n2)
    return n1 + n2
}

