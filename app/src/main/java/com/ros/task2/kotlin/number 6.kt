package com.ros.task2.kotlin

fun areaCircle (radius:Double):Double{
    var area:Double
    if (radius % 7.0 == 0.0) {area = (22*radius*radius)/7}
    else {area = 3.14*radius*radius}
    print("Area=")
    return (area)
}
fun main(){
    println("Input Radius")
    var radius = readLine()!!.toDouble()
    println(areaCircle(radius))
}