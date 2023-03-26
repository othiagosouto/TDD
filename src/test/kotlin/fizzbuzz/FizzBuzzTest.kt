package fizzbuzz;

//https://kata-log.rocks/fizz-buzz-kata

import org.junit.jupiter.api.Test;
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun `Given numbers from 1 to 5 Then Replace all multiple of 3 to Fizz and all multiples of 5 to Buzz`() {
        val fizzBuzz = FizzBuzz(helper = FizzBuzzHelper()) { listOf(1, 2, 3, 4, 5) }

        val result = fizzBuzz.execute()

        assertEquals(expected = "1\n2\nFizz\n4\nBuzz", actual = result)
    }
}