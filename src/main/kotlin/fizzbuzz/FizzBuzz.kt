package fizzbuzz

class FizzBuzz(private val helper: FizzBuzzHelper, private val fetchNumbers: () -> List<Int>) {

    fun execute(): String {
        val input = fetchNumbers().map {
            when {
                helper.isFizzBuzz(it) -> FIZZ_BUZZ
                helper.isFizz(it) -> FIZZ
                helper.isBuzz(it) -> BUZZ
                else -> it
            }
        }

        return input.joinToString("\n")
    }

    private companion object {
        const val FIZZ = "Fizz"
        const val BUZZ = "Buzz"
        const val FIZZ_BUZZ = "$FIZZ$BUZZ"
    }
}
