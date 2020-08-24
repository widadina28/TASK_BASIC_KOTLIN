package com.ros.task2.kotlin

fun leapYear (year:Int){
    if (year%400==0) {
        println("$year is leap year")}
    else if (year%400!=0 && year%100==0) {
        println("$year is not leap year")}
    else if (year%400!=0 && year%100!=0 && year%4==0) {
        println("$year is leap year")}
    else {
        println("$year is not leap year")}
}

fun main (){
    print("Input tahun:")
    var year= readLine()!!.toInt()
    println(leapYear(year))
}