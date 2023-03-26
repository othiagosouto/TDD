package fizzbuzz

class FizzBuzz(private val fetchNumbers: () -> List<Int>) {

    fun execute(): String {
        val input = fetchNumbers().map { if (it % 3 == 0) "Fizz" else it }

        return input.joinToString("\n")
    }
}
