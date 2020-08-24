package com.ros.task2.kotlin

fun checkAge (yob:Int):Int{
    println("Masukkan Tahun Sekarang =")
    var yn = readLine()!!.toInt()
    var age = yn-yob
    println("Usia Sekarang=")
    return (age)
}
fun main(){
    println("Masukkan Tahun Lahir=")
    var yob = readLine()!!.toInt()
    println(checkAge(yob))
}

