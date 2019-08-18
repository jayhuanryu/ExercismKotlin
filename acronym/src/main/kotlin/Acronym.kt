import java.util.regex.Pattern

class Acronym {

    companion object {
        val pattern : Pattern = "[\\s-]".toPattern()

        fun generate(phrase: String): String {
            return phrase.split(pattern)
                    .asSequence()
                    .filter { !it.isNullOrEmpty() }
                    .map { it?.first() }
                    .filter { it.isLetter() }
                    .toMutableList()
                    .joinToString(separator = "")
                    .toUpperCase()
        }
    }
}