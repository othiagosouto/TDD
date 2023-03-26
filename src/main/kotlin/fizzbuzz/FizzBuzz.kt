package fizzbuzz

class FizzBuzz(private val fetchNumbers: () -> List<Int>) {

    fun execute(): String {
        val input = fetchNumbers().map { if (it % 3 == 0) "Fizz" else if(it %5 == 0) "Buzz" else it }

        return input.joinToString("\n")
    }
}
