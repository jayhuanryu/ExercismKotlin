import java.util.regex.Pattern

object PigLatin {


    private val vowelRegex = Regex("(?<begin>^|\\s+)(?<vowel>a|e|i|o|u|yt|xr)(?<rest>\\w+)")
    private val consonantRegex = Regex("(?<begin>^|\\s+)(?<consonant>ch|qu|thr|th|sch|yt|rh|\\wqu|\\w)(?<rest>\\w+)")

    private const val vowelReplacement = "\${begin}\${vowel}\${rest}ay"
    private const val consonantReplacement = "\${begin}\${rest}\${consonant}ay"

    fun translate(input: String): String =
            if (vowelRegex.matches(input)) vowelRegex.replace(input, vowelReplacement)
            else consonantRegex.replace(input, consonantReplacement)
}
//        private val regRule1 = Regex("^[aeiou|xr|yt][a-z]*]")
//        private val regRule2 = Regex("^[a-z]*[aeiou][a-z]*")
//        private val regRule3 = Regex("^[a-z]*[qu][a-z]]*")
//        private val regRule4 = Regex("^[a-z][y]|[a-z]*[y][a-z]*")
//
//        private val vowel = Regex("[aeiou]")
//
//        val rules = listOf(1 to regRule1 , 2 to regRule2, 3 to regRule3, 4 to regRule4)
//        fun translate(sentence : String) : String {
//
//            val splited = sentence.split(" ")
//            var str : MutableList<String> = mutableListOf()
//
//            splited.forEach { word ->
//               str.add(checkMatching(word))
//            }
//
//            return str.joinToString(" ")
//
//        }
//
//
//        private fun checkMatching(inputValue: String) : String {
//            var returnValue : String
//
//
//
//            return numb
//        }
//
//        private fun isMatchingRule1(word : String) {
//
//        }
//
//        private fun addAyToString(toBeAddedString : String) : String { return toBeAddedString + "ay" }
//
//        private fun changeValueRule2(inputValue: String) : String{
//            if (inputValue.matches(regRule3)) {
//                 return changeValueRule3(inputValue)
//            }
//            else {
//
//                return  returnValue
//            }
//
//        }
//
//        private fun changeValueRule3(inputValue: String ) : String {
//
//        }
//
//
//    }
//
//
//        private fun isStartWithVowel(inputValue : String) : Boolean {
//
//        }
//}
