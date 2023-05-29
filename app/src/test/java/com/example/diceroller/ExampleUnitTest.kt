package com.example.diceroller

import junit.framework.TestCase.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun generateNumbers() {
        val dice = MainActivity.Dice(6)
        val rollNumber = dice.roll()

        assertTrue("Number not correct ",rollNumber in (1..6)  )
    }
}