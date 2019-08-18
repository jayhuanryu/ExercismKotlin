import java.lang.StringBuilder

object RnaTranscription {

    fun transcribeToRna(dna: String) :String {
        val rna = StringBuilder()
        dna.forEach {
            rna.append(translate(it))
        }
        return rna.toString().toUpperCase()
    }

    fun translate(character : Char) :Char {
        return when (character) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> character
        }

    }

}
