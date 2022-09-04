import model.Player
import utils.IOUtils

class App {
    private val bothPlayers = arrayListOf<Player>()

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var iDo = true
            while (iDo) {
                App().run()
                iDo = DoYouWantTo().playAgain()
            }
        }
    }

    fun run() {
        initHeader()
        play()
    }

    private fun initHeader() {
        println("=======================================")
        println("GUNTING BATU KERTAS (GBK)")
        println("=======================================")
    }

    private fun play() {
        DoYouWantTo().useCustomName(bothPlayers)

        print("""
            =======================================
            Silakan ketik salah satu pilihan
            (Gunting / Batu / Kertas) untuk
            setiap pemain.
            =======================================
            
            
        """.trimIndent())
        print("Pilihan ${bothPlayers[0].name}: ")
        bothPlayers[0].hand = scanInput("Pilihan ${bothPlayers[0].name}: ")
        print("Pilihan ${bothPlayers[1].name}: ")
        bothPlayers[1].hand = scanInput("Pilihan ${bothPlayers[1].name}: ")

        println("\n${fight(bothPlayers)}")
        println("=======================================\n")
    }

    private fun scanInput(message: String): String {
        var theInput: String? = IOUtils.getHand()
        while (theInput == null) {
            println("Masukan tidak dikenali. Silakan ketik ulang.")
            print(message)
            theInput = IOUtils.getHand()
        }
        return theInput
    }

    private fun fight(listOfPlayers: ArrayList<Player>): String {
        val choice1: Int = Player().possibleChoices.indexOf(listOfPlayers[0].hand)
        val choice2: Int = Player().possibleChoices.indexOf(listOfPlayers[1].hand)
        val playerOneWins: Boolean =
            (choice1 == 0 && choice2 == 2) || (choice1 == 1 && choice2 == 0) || (choice1 == 2 && choice2 == 1)
        //val draw: Boolean = listOfPlayers[0].hand == listOfPlayers[1].hand
        val playerTwoWins: Boolean =
            (choice1 == 2 && choice2 == 0) || (choice1 == 1 && choice2 == 2) || (choice1 == 0 && choice2 == 1)
        return when {
            playerOneWins -> "Hasil:\n${listOfPlayers[0].name} MENANG! 🎉"
            playerTwoWins -> "Hasil:\n${listOfPlayers[1].name} MENANG! 🎊"
            else -> "Hasil:\nSERI!!!1!1!1! 😱"
        }
    }
}