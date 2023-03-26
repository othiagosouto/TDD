package fizzbuzz

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzHelperTest {


    @Test
    fun `isFizz Given number multiple of 3 Then return Fizz`() {
        val helper = FizzBuzzHelper()

        val result = helper.isFizz(9)

        assertEquals(expected = "Fizz", actual = result)
    }
}