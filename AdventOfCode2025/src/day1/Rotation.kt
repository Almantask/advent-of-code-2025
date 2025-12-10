package day1

class Rotation(val symbol: String, val value: Int) {
    companion object {
        fun fromText(input: String): Int {
            if(input.length < 2)
                throw IllegalArgumentException("Invalid rotation symbol: $input")
            val multiplier = when(val direction = input.substring(0, 1)) {
                "R" -> 1
                "L" -> -1
                else -> throw IllegalArgumentException("Invalid rotation direction: $direction")
            }
            val amount = input.substring(1).toInt();

            return multiplier * amount
        }
    }
}