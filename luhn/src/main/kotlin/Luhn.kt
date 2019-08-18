import java.util.regex.Pattern

class Luhn {

    companion object {


        fun isValid(inputNumber: String): Boolean {

            val ( digits, others ) = inputNumber
                    .filterNot(Char::isWhitespace)
                    .partition(Char::isDigit)


            require(digits.length > 1 && others.isEmpty()) { return false }

            //If doubling the number results in a number greater than 9 then subtract 9 from the product.
            // The results of our doubling:

            // Then sum all of the digits:
            return digits.map { it.toInt() - '0'.toInt() }
                    .reversed()
                    .mapIndexed { index, i ->
                        if (index and 1 == 1)
                            if (i.times(2) > 9)
                                i.times(2).minus(9)
                            else
                                i.times(2)
                        else
                            i
                    }.sum().rem(10) == 0
        }

    }


}