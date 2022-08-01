package com.sandul.lesson_7_unittests_android

import org.junit.Assert.*

import org.junit.After
import org.junit.Test
import java.lang.IllegalArgumentException

class TriangleTest {

    @Test
    fun test_valid_data() {
        val triangle = Triangle(3,4,5)
        val actual = triangle.isRightTriangle()
        val expected = true
        assertEquals(expected, actual)
    }

    @Test(expected = IllegalArgumentException::class)
    fun test_negative_data() {
        val triangle = Triangle(-3,-4,-5)
        val actual = triangle.isRightTriangle()
        val expected = false
        assertEquals(expected, actual)
    }

    @Test(expected = IllegalArgumentException::class)
    fun test_invalid_triangle() {
        val triangle = Triangle(1,2,3)
        val actual = triangle.isRightTriangle()
        val expected = false
        assertEquals(expected, actual)
    }

    @Test
    fun test_not_righttriangles() {
        val triangles = listOf(
            Triangle(3,4,6),
            Triangle(3,5,6),
            Triangle(3,4,4),
            Triangle(3,3,5)
        )

        val actuals = triangles.map{it.isRightTriangle()}
        val expected = true
        actuals.forEach{ actual ->
            assertEquals(expected, actuals)
        }

    }
}