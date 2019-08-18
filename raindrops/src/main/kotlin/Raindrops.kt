
class Raindrops {
    companion object {
        fun convert(number : Int) : String{

            var convertedString :String = ""

            var factorNumbers = factorsOfNumber(number)
            for (item in factorNumbers) {
                if ( item == 3) {
                    convertedString += "Pling"
                }
                else if ( item == 5) {
                    convertedString += "Plang"
                }
                else if ( item == 7) {
                    convertedString += "Plong"
                }
            }

            if (convertedString.isEmpty()) {
                convertedString = number.toString()
            }

            return convertedString

        }

        fun factorsOfNumber(num : Int) :MutableList<Int>{
            val factors = mutableListOf<Int>()

            if (num < 1)
                return factors
            (1..num / 2)
                    .filter { num % it == 0 }
                    .forEach{ factors.add(it)}

            factors.add(num)
            return factors
        }
    }
}