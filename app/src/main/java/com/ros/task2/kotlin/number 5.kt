package com.ros.task2.kotlin

fun areaTriangle (base:Double, high:Double):Double{
    var area = (base*high)/2
    print("Area=")
    return (area)
}

fun main (){
    println("Input base=")
    var base = readLine()!!.toDouble()
    println("Input high=")
    var high = readLine()!!.toDouble()
    println(areaTriangle(base,high))
}