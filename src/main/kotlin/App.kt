import model.Player
import utils.IOUtils

class App {
    private val bothPlayers = arrayListOf<Player>()

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }

    fun run() {
        initHeader()
    }

    private fun initHeader() {
        println("=======================================")
        println("GUNTING BATU KERTAS (GBK)")
        println("=======================================")
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
}