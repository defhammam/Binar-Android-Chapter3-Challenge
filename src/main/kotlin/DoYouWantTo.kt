import utils.IOUtils
import model.Player

class DoYouWantTo {
    private val begin = "(Silakan pilih dan ketik angka 1 atau 2)\nApakah Anda ingin"
    private val end = "\n1. Ya\n2. Tidak\nJawaban: "

    fun useCustomName(listOfPlayers: ArrayList<Player>): ArrayList<Player> {
        print("$begin menggunakan nama sendiri?$end")
        val isWilling: Boolean = IOUtils.ohYesOhNo()
        for (i in 0..1) {
            if (isWilling) {
                print("Ketik nama pemain ke-${i + 1}: ")
                listOfPlayers.add(Player(readLine().toString()))
            } else {
                listOfPlayers.add(Player("Pemain ${i + 1}"))
            }
        }
        return listOfPlayers
    }

    fun playAgain(): Boolean {
        print("$begin bermain lagi?$end")
        return IOUtils.ohYesOhNo()
    }
}