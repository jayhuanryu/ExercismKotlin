import kotlin.math.pow

class Squares(private val n : Int) {

    fun squareOfSum() : Int {

        return ((n * (n + 1)) / 2.toDouble()).pow(2.0).toInt()

    }

    fun sumOfSquares() : Int {
        return n * (n+1) * (2 * n + 1) / 6
    }

    fun difference() : Int {
        return squareOfSum() - sumOfSquares()
    }
}