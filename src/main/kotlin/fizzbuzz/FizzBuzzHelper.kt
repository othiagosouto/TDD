package fizzbuzz

class FizzBuzzHelper {
    fun isFizz(i: Int): Boolean = i % 3 == 0
    fun isBuzz(i: Int): Boolean = i % 5 == 0

    fun isFizzBuzz(i: Int): Boolean = isFizz(i) && isBuzz(i)
}