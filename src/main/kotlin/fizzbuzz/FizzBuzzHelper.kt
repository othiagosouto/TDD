package fizzbuzz

class FizzBuzzHelper {
    fun isFizz(i: Int): String {
        return if(i%3 == 0) "Fizz" else "$i"
    }
}