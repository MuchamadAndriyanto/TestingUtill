package com.example.testtestting

import org.junit.Assert.*
import org.junit.Test

class RegistrasiUtillTest {

    @Test
    fun testValidRegistrationInput() {
        val result = RegistrasiUtill.validateRegistrationInput(
            "JohnDoe",
            "Abcd1234",
            "Abcd1234"
        )
        assertEquals(true, result)
    }

    @Test
    fun testEmptyUsername() {
        val result = RegistrasiUtill.validateRegistrationInput(
            "",
            "Abcd1234",
            "Abcd1234"
        )
        assertEquals(false, result)
    }

    @Test
    fun testEmptyPassword() {
        val result = RegistrasiUtill.validateRegistrationInput(
            "JohnDoe",
            "",
            ""
        )
        assertEquals(false, result)
    }

    @Test
    fun testExistingUsername() {
        val result = RegistrasiUtill.validateRegistrationInput(
            "Behroz",
            "Abcd1234",
            "Abcd1234"
        )
        assertEquals(false, result)
    }

    @Test
    fun testDifferentConfirmedPassword() {
        val result = RegistrasiUtill.validateRegistrationInput(
            "JohnDoe",
            "Abcd1234",
            "Abcd5678"
        )
        assertEquals(false, result)
    }

    @Test
    fun testPasswordWithLessThanTwoDigits() {
        val result = RegistrasiUtill.validateRegistrationInput(
            "JohnDoe",
            "Abcd",
            "Abcd"
        )
        assertEquals(false, result)
    }
}
