import kotlin.math.abs
import kotlin.math.log
import kotlin.math.log10
import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        //TODO("Implement the function to complete the task")
        var powedDigit = 0
            input.toString().map {
                powedDigit += it.toString().toDouble().pow(input.length().toDouble()).toInt()
            }

        return powedDigit == input
        }
    }

    fun Int.length() = when(this) {
        0 -> 1
        else -> log10(abs(toDouble())).toInt() + 1

}
