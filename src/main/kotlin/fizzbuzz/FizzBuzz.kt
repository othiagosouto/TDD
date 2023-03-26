package fizzbuzz

class FizzBuzz {

    fun execute(): String {
        val input = (1..100).map { if (it % 3 == 0) "Fizz" else it }

        return input.joinToString("\n")
    }
}
