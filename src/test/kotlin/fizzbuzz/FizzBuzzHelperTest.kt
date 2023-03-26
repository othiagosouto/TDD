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

    @Test
    fun `isBuzz Given number non multiple of 5 Then return false`() {
        val helper = FizzBuzzHelper()

        val result = helper.isBuzz(14)

        assertEquals(expected = false, actual = result)
    }

    @Test
    fun `isFizzBuzz Given number multiple of 5 and 3 Then return true`() {
        val helper = FizzBuzzHelper()

        val result = helper.isFizzBuzz(15)

        assertEquals(expected = true, actual = result)
    }

    @Test
    fun `isFizzBuzz Given number non multiple of 3 and 5 Then return false`() {
        val helper = FizzBuzzHelper()

        val result = helper.isFizzBuzz(8)

        assertEquals(expected = false, actual = result)
    }

    @Test
    fun `isFizzBuzz Given number multiple of 3 and non multiple 5 Then return false`() {
        val helper = FizzBuzzHelper()

        val result = helper.isFizzBuzz(12)

        assertEquals(expected = false, actual = result)
    }

    @Test
    fun `isFizzBuzz Given number multiple of 5 and non multiple 3 Then return false`() {
        val helper = FizzBuzzHelper()

        val result = helper.isFizzBuzz(10)

        assertEquals(expected = false, actual = result)
    }
}