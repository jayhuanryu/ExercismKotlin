class DiamondPrinter {

    val BREAKINGLINE = "\n"
    val BLANK = " "

    fun printToList(input: Char): List<String> {
        val centerPosition = charMap[input]
        val width = centerPosition?.times(2)!!.minus(1)
        val list = mutableListOf<String>()



        for (item in charMap) {
            list.add(genLine(width, item, centerPosition))
            if (item.key == input) break
        }

        for (i in list.size - 2 downTo 0) {
            list.add(list[i])
        }



        return list
    }

    private fun genLine(width: Int, item: MutableMap.MutableEntry<Char, Int>, centerPosition: Int): String {
        var returnString: String = ""
        val localPosition1 = centerPosition - item.value + 1
        val localPosition2 = centerPosition + item.value - 1


        for (i in 1..width) {
            if (i == localPosition1 || i == localPosition2) {
                returnString += item.key
            } else {
                returnString += BLANK
            }
        }


        return returnString
    }


    private val charMap = mutableMapOf(
            'A' to 1,
            'B' to 2,
            'C' to 3,
            'D' to 4,
            'E' to 5,
            'F' to 6,
            'G' to 7,
            'H' to 8,
            'I' to 9,
            'J' to 10,
            'K' to 11,
            'L' to 12,
            'M' to 13,
            'N' to 14,
            'O' to 15,
            'P' to 16,
            'Q' to 17,
            'R' to 18,
            'S' to 19,
            'T' to 20,
            'U' to 21,
            'V' to 22,
            'W' to 23,
            'X' to 24,
            'Y' to 25,
            'Z' to 26
    )


}
