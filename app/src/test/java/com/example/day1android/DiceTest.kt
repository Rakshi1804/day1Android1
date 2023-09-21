package com.example.day1android

import junit.framework.TestCase

class DiceTest : TestCase() {

    fun testRoll() {
        val dice=Dice(6)
        val diceroll=dice.roll()
        assertTrue(diceroll in 1..6)
    }
}