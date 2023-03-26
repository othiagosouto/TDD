package fizzbuzz;

//https://kata-log.rocks/fizz-buzz-kata

import org.junit.jupiter.api.Test;
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun `Given numbers from 1 to 100 Then Replace all multiple of 3 to Fizz`() {
        val fizzBuzz = FizzBuzz()
        val input =(1..100).map{ if (it%3==0) "Fizz" else it}.joinToString("\n")

        assertEquals(expected = input, fizzBuzz.execute())
    }

}