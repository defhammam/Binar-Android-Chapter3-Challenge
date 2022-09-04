package utils
import model.Player

object IOUtils {
    fun getHand(default: String = ""): String? {
        val choice: String = readLine()?.lowercase() ?: default
        return if (Player().possibleChoices.contains(choice))
            choice
        else
            null
    }
}