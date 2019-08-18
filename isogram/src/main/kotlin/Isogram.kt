import java.util.regex.Pattern

class Isogram {
    companion object {

        /**
        fun isIsogram(inputString : String) : Boolean {
            var numberOfCharacters = 0

            val regEx = "[a-z]"
            val pattern = Pattern.compile(regEx)
            val matcher = pattern.matcher(inputString.toLowerCase())

            val group : MutableMap<String, Int> = mutableMapOf()
            while(matcher.find()) {
                numberOfCharacters++
                group[matcher.group()] = 0
            }

            return group.size == numberOfCharacters
        }
        **/


        fun isIsogram(inputString: String) : Boolean {
            var str = inputString.replace(" ", "").replace("-", "").toCharArray()
            var result = str.distinct()

            return str.size == result.size
        }
    }
}