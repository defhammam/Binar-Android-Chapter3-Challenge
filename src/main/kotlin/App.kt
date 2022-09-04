class App {
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
}