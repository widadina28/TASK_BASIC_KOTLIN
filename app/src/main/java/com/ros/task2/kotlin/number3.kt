package com.ros.task2.kotlin

fun main() {
    println("Masukkan angka: ")
    var x = readLine()!!.toInt()
    if (x % 2==0) {println("$x is even number")}
        else {
        println("$x is odd number")}
}