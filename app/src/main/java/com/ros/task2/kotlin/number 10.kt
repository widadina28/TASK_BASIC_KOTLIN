package com.ros.task2.kotlin

fun Words (kata:String) {
    var vocal = ""
    var kons = ""
    var arrayKata = kata.split("").toTypedArray()
    for (x in 0..kata.length) {
        if (arrayKata[x].equals("A") || arrayKata[x].equals("I") || arrayKata.equals("U") || arrayKata[x].equals("E") || arrayKata[x].equals("O"))
        {
            vocal += arrayKata[x] + "\n"
        } else {
            kons += arrayKata[x] + "\n"
        }
    }

    print(vocal)
    print(kons)
}

fun main (){
    println("Masukkan kata")
    var kata = readLine()!!.toString()
    Words(kata)
}
