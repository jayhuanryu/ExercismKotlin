class BeerSong {
    companion object{

        fun verses(startBeer: Int, finishBeer:Int) :String {
            require( startBeer >= finishBeer)

            val song : StringBuilder = StringBuilder()

            var bottleCount = startBeer
            while (bottleCount >= finishBeer) {

                if (song.isNotEmpty()) song.append("\n")

                val bottlesOfBeer = bottlesOfBeer(bottleCount--)

                var line : String = "";

                line = "$bottlesOfBeer on the wall, $bottlesOfBeer.\n"  // upper part


                // lower part
                when {
                    bottleCount > 0 -> {
                        line += "Take one down and pass it around, "
                        val newBottleOfBeer = bottlesOfBeer(bottleCount)
                        line += "$newBottleOfBeer on the wall.\n"
                    }
                    bottleCount == 0 -> {
                        line += "Take it down and pass it around, "
                        val newBottleOfBeer = bottlesOfBeer(bottleCount)
                        line += "$newBottleOfBeer on the wall.\n"
                    }
                    else -> // this is the case when startNumber of beer is 0
                        line += "Go to the store and buy some more, 99 bottles of beer on the wall.\n"
                }

                song.append(line.capitalize())
            }
            return song.toString()
        }

        private fun bottlesOfBeer(numberOfBeer : Int) : String {
             return when (numberOfBeer) {
                0 -> "no more bottles"
                1 -> "1 bottle"
                else -> "$numberOfBeer bottles"
            } + " of beer"

        }
    }


}