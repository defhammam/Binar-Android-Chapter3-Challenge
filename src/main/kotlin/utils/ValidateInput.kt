package utils

class ValidateInput: Validation() {
    override fun validateString(): String {
        return readLine()?.lowercase() ?: ""
    }

    override fun validateInt(): Int {
        TODO("Not yet implemented")
    }
}