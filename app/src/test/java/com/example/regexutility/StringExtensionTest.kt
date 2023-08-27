package com.example.regexutility

import org.junit.Test

import org.junit.Assert.*

/**
 * Test of string extension on password validation by acceptance criteria.
 */

class StringExtensionTest {
    private val lengthPassword = 50
    private val specificCharacters = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~"
    private val upperCaseChars = "JNFDJKF"
    private val lowerCaseChars = "dfgsdfgsdfg"
    private val digit = "54684645"
    private val mixChars = "sfdKJH54$%^$"
    private val allSpecificCharsLowerUpperCaseDigit = "ssdfgKJH234156!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~"
    private val specificCharactersSpace = "!\"#$%&'()*+,-./:;<= >?@[\\]^_` {|}~"
    private val upperCaseCharsSpace = "JNFDJKF "
    private val lowerCaseCharsSpace = "dfgsdf gsdfg"
    private val digitSpace = " 54684645"
    private val mixCharsSpace = "sfdKJH 54$%^$ "
    private val allSpecificCharsLowerUpperCaseDigitSpace = "ssdfgKJH234156!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ "
    private val minimumLengthPassword = "1aA%"
    private val minimumLengthPasswordSpace = "1aA %"
    private val shortInput = "2A&"
    private val longInput = "dfgkjsdfgkls*&(^(*&^2342359kjsdfnkDSKFHKSDHFyj@784593485" //56 chars

    @Test
    fun password_isCorrect() {
        assertEquals(true, minimumLengthPassword.isValidPassword(lengthPassword))
        assertEquals(true, allSpecificCharsLowerUpperCaseDigit.isValidPassword(lengthPassword))
        assertEquals(true, mixChars.isValidPassword(lengthPassword))
    }

    @Test
    fun password_isNoCorrect() {
        assertEquals(false, specificCharacters.isValidPassword(lengthPassword))
        assertEquals(false, upperCaseChars.isValidPassword(lengthPassword))
        assertEquals(false, lowerCaseChars.isValidPassword(lengthPassword))
        assertEquals(false, digit.isValidPassword(lengthPassword))
        assertEquals(false, specificCharactersSpace.isValidPassword(lengthPassword))
        assertEquals(false, upperCaseCharsSpace.isValidPassword(lengthPassword))
        assertEquals(false, lowerCaseCharsSpace.isValidPassword(lengthPassword))
        assertEquals(false, digitSpace.isValidPassword(lengthPassword))
        assertEquals(false, allSpecificCharsLowerUpperCaseDigitSpace.isValidPassword(lengthPassword))
        assertEquals(false, mixCharsSpace.isValidPassword(lengthPassword))
        assertEquals(false, minimumLengthPasswordSpace.isValidPassword(lengthPassword))
        assertEquals(false, shortInput.isValidPassword(lengthPassword))
        assertEquals(false, longInput.isValidPassword(lengthPassword))
    }
}