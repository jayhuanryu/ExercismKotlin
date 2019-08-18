class PhoneNumber(private val inputValue: String) {

    private val digitFormat = "[1]?[2-9]{1}[0-9]{2}[2-9]{1}[0-9]{6}".toRegex()

    var number: String? = processNumbers()


    private fun processNumbers(): String? {

        return removeUsaCode(inputValue.filter { it.isDigit() }.takeIf { digitFormat.matches(it) })

    }

    private fun removeUsaCode(value : String?) : String? {
        return if (value?.length == 11 ) {
            value.substring(1)
        }
        else
            value
    }


}
