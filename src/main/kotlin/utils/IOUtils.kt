package utils
import model.Player

object IOUtils {
    fun getHand(): String? {
        val choice: String = ValidateInput().validateString()
        return if (Player().possibleChoices.contains(choice))
            choice
        else
            null
    }

    fun ohYesOhNo(): Boolean {
        val choice: Int = ValidateInput().validateInt()
        return choice == 1
    }
}