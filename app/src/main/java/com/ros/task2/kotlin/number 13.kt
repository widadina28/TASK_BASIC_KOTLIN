package com.ros.task2.kotlin


fun main() {
    println("Masukkan angka:")
    var angka = readLine()!!.toLong()
    var ang = angka.toString()
    var arrayang = ang!!.split("0")
    for (i in 0..arrayang.size-1)
    {
        var b= arrayang[i].split("")
        var c= b.sorted().joinToString("").toLong()
        print(c)
    }
}