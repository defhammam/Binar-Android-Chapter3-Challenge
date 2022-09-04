package utils

class ValidateInput: Validation() {
    override fun validateString(): String {
        return readLine()?.lowercase() ?: ""
    }

    override fun validateInt(): Int {
        return readLine()?.toInt() ?: 0
    }
}