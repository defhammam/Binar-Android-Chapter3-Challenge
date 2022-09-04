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