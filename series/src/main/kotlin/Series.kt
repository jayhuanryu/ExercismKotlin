
class Series {

    companion object {
        fun slices(sliceNumber : Int, inputNumber : String): List<List<Int>> {


            require (inputNumber.length >= sliceNumber) {throw IllegalArgumentException()}


            return inputNumber.
                    map { it.toInt() - '0'.toInt() }.
                    windowed(size = sliceNumber, step = 1)


        }
    }
}