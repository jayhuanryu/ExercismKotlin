import kotlin.IllegalArgumentException

class Series(inputString: String) {


    var inputString = inputString

    init {
        require( inputString.all { it.isDigit() }) { throw IllegalArgumentException()}
    }

    fun getLargestProduct(numberOfInt: Int) : Int? {

        require(numberOfInt >= 0) { throw IllegalArgumentException() }
        require(inputString.length >= numberOfInt) {throw  IllegalArgumentException()}

        if (numberOfInt == 0) return 1
        return inputString.windowed(size = numberOfInt, step = 1) {
                it.fold(1, {
                    acc: Int, c: Char ->
                    acc * (c - '0')
                })}.max()
    }
}