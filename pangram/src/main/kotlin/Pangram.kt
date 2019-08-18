import java.util.regex.Pattern

class Pangram {

   companion object {
       fun isPangram(variable : String) : Boolean {

           var value = variable.toUpperCase()

           val regEx = "[A-Z]"
           val pattern = Pattern.compile(regEx)
           val matcher = pattern.matcher(value)

           var group = mutableMapOf<String, Int>()

           while (matcher.find()) {
               group[matcher.group()] = 1
           }

           return group.size == 26
       }


   }

}