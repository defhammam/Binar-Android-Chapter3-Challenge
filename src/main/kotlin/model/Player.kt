package model

data class Player(var name: String = "", var hand: String = "none")
{
    val possibleChoices = listOf("gunting", "batu", "kertas")
}
