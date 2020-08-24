package com.ros.task2.kotlin

fun main(){
    var x:Int = 10
    var y:Int = 20
    x=y.also { y=x }
    println("x=$x")
    println("y=$y")
}