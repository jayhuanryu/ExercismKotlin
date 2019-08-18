import java.util.*

class Hamming {



    companion object {


        fun compute(firstStrand: CharSequence, secondStrand: CharSequence) : Int {

            require(firstStrand.length == secondStrand.length) {
                "left and right strands must be of equal length."
            }
           return  firstStrand.zip(secondStrand).count { it.first != it.second }

        }
    }
}