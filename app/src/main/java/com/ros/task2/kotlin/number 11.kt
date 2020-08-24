package com.ros.task2.kotlin

fun main(){
    println("Masukkan kata yang diuji")
    var kata= readLine()!!.toString()
    var code= ""
    for (i in kata.length-1 downTo 0){
        code += kata[i]
    }
    println(code)
    if (kata!=code) {print("bukan polindrom")
    } else print("polindrom")
}

