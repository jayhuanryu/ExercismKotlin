import java.lang.Character.isUpperCase

class Bob {

    companion object {
        fun hey(inputString: String): String {

            return when (ANSWER.parseRequest(inputString)) {
                ANSWER.QUESTION -> "Sure."
                ANSWER.YELL -> "Whoa, chill out!"
                ANSWER.YELLQUESTION -> "Calm down, I know what I'm doing!"
                ANSWER.ADDRESS -> "Fine. Be that way!"
                ANSWER.NOTHING -> "Whatever."
            }
        }

    }

}


enum class ANSWER {
    QUESTION,
    YELL,
    YELLQUESTION,
    ADDRESS,
    NOTHING;

    companion object {
        fun parseRequest(request: String) =
                when {
                    request.filter { it.isLetter() || it == '?' }.let { it.length != 1 && it.isNotEmpty() && it.endsWith('?') && it.none { it.isLowerCase() } } -> YELLQUESTION
                    request.trimEnd().endsWith('?') -> QUESTION
                    request.isBlank() -> ADDRESS
                    request.filter { it.isLetter() }.let { it.isNotEmpty() && it.none { it.isLowerCase() } } -> YELL
                    else -> NOTHING
                }


    }

}


//    Bob answers 'Sure.' if you ask him a question.
//
//    He answers 'Whoa, chill out!' if you yell at him.
//
//    He answers 'Calm down, I know what I'm doing!' if you yell a question at him.
//
//    He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//    He answers 'Whatever.' to anything else.
//}
