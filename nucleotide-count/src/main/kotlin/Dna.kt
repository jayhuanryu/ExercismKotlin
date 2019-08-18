class Dna(private val inputValue: String) {

    var nucleotideCounts = mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)
    val candidates = "[ACGT]*".toRegex()

    init {
        require(candidates.matches(inputValue)) {throw IllegalArgumentException()}
        getNumbers()
    }

    private fun getNumbers() {
        inputValue.forEach {
            var value: Int? = nucleotideCounts[it]
            if (value == null)
                value = 1
            else
                value++
            nucleotideCounts[it] = value

        }
    }


}