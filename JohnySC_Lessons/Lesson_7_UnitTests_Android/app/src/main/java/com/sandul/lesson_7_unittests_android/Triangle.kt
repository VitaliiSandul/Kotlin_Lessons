package com.sandul.lesson_7_unittests_android

class Triangle(private val sideA: Int,
               private val sideB: Int,
               private val sideC: Int){

    init{
        if(sideA <= 0 || sideB <= 0 || sideC <= 0){
            throw IllegalArgumentException("triangle sides can't bee non-positive")
        }

        if(sideA + sideB <= sideC || sideB + sideC <= sideA || sideA + sideC <= sideB){
            throw IllegalArgumentException("triangle sides can't bee non-positive")
        }
    }

    fun isRightTriangle(): Boolean {
        return sideA.square() + sideB.square() == sideC.square() ||
                sideA.square() + sideC.square() == sideB.square() ||
                sideC.square() + sideB.square() == sideA.square()
    }

    private fun Int.square(): Int{
        return this*this
    }
}