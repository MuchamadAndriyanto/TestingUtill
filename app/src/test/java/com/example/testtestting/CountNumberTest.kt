package com.example.testtestting

import org.junit.Assert.*
import org.junit.Test

class CountNumberTest{

    @Test
    fun testSum() {
        val countNumber = CountNumber()
        val result = countNumber.sum(2, 3)
        assertEquals(5, result)
    }

}