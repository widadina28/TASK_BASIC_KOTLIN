package com.ros.task2.kotlin

fun triangle(num: Int): String {
    var hasil: String = ""
    for(x in 1..num) {
        for(y in 0..num-x) {
            hasil += y+1
        }
        hasil += "\n"
    }
    return (hasil)
}

fun main(){
    print("Masukkan angka=")
    var printSegitiga = readLine()!!.toInt()
    println(triangle(printSegitiga))
}