package fizzbuzz

class FizzBuzz(private val helper: FizzBuzzHelper, private val fetchNumbers: () -> List<Int>) {

    fun execute(): String {
        val input = fetchNumbers().map { if (helper.isFizz(it)) "Fizz" else if (it % 5 == 0) "Buzz" else it }

        return input.joinToString("\n")
    }
}
