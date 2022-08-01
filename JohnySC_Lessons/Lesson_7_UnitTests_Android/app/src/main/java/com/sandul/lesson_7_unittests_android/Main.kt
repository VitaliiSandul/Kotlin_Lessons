package com.sandul.lesson_7_unittests_android

object Main{
    @JvmStatic
    fun main(args: Array<String>){
        val triangle = Triangle(3,4,5,)
        print(triangle.isRightTriangle())
    }
}