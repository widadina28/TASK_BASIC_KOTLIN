package com.ros.task2.kotlin


fun main(){
    val text="saya belajar javascript"
    println(text)

    val reversed : String=
        text.split(" ")
            .reversed().joinToString(" ")
    println(reversed)
}