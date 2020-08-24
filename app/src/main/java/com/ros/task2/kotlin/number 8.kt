package com.ros.task2.kotlin

fun unScore (math:Double, eng:Double, ind:Double, science:Double){
    var avarage = (math+eng+ind+science)/4
    println("Score UN = $avarage")
    when (avarage) {
        in 90.0..100.0 -> println("Grade A")
        in 80.0..89.0 -> println("Grade B")
        in 70.0..79.0 -> println("Grade C")
        in 60.0..69.0 -> println("Grade D")
        in 0.0..59.0 -> println("Grade E")
    }
}

fun main (){
    println("Masukkan nilai math=")
    var math = readLine()!!.toDouble()
    println("Masukkan nilai english=")
    var eng = readLine()!!.toDouble()
    println("Masukkan nilai indonesia=")
    var ind = readLine()!!.toDouble()
    println("Masukkan nilai science=")
    var science = readLine()!!.toDouble()
    println(unScore(math,eng,ind,science))
}