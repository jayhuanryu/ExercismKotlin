class Anagram (private val baseWord :  String){

   fun match(list: List<String>) : Set<String> {


      baseWord.toSortedSet()
      return setOf()
   }
}

fun String.toSortedLowerCase(): List<Char> = this.toLowerCase().toList().sorted()