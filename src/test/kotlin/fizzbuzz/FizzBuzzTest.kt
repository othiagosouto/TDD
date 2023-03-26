package fizzbuzz;

//https://kata-log.rocks/fizz-buzz-kata

import org.junit.jupiter.api.Test;
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun `Given numbers from 1 to 15 Then Replace all multiple of 3 to Fizz and all multiples of 5 to Buzz and numbers multiples of 3 and 5 to FizzBuzz`() {
        val fizzBuzz = FizzBuzz(helper = FizzBuzzHelper()) { listOf(1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15) }

        val result = fizzBuzz.execute()

        assertEquals(expected = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz", actual = result)
    }
}