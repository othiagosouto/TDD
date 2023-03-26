package fizzbuzz

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzHelperTest {


    @Test
    fun `isFizz Given number multiple of 3 Then return true`() {
        val helper = FizzBuzzHelper()

        val result = helper.isFizz(9)

        assertEquals(expected = true, actual = result)
    }

    @Test
    fun `isFizz Given number non multiple of 3 Then return false`() {
        val helper = FizzBuzzHelper()

        val result = helper.isFizz(8)

        assertEquals(expected = false, actual = result)
    }

    @Test
    fun `isBuzz Given number multiple of 5 Then return true`() {
        val helper = FizzBuzzHelper()

        val result = helper.isBuzz(5)

        assertEquals(expected = true, actual = result)
    }
}