package day1

import java.nio.file.Files
import java.nio.file.Paths

class Part2(inputFilePath: String) {
    var sequence: Int = 50

    fun solve(): Int {
        var password = 0
        for (line in lines){
            val rotation = Rotation.fromText(line)
            val initialSequence = sequence
            sequence += rotation
            if(sequence > 99){
                val (reduced, timesFullRotation) = reducePositive(sequence)
                sequence = reduced
                password += timesFullRotation
                if(sequence == 0){
                    password -= 1
                }
            }
            if(sequence < 0){
                val (reduced, timesFullRotation) = reduceNegative(sequence)
                sequence = reduced
                password += timesFullRotation
                if(initialSequence == 0){
                    password -= 1
                }
            }
            println("Sequence: $sequence")

            if(sequence == 0){
                password += 1
            }
            println("Password: $password")
        }

        return password
    }

    fun reducePositive(number: Int): Pair<Int, Int> {
        val timesReduced = number / 100
        val reducedNumber = number % 100
        return Pair(reducedNumber, timesReduced)
    }

    fun reduceNegative(number: Int): Pair<Int, Int> {
        val timesReduced = (-number - 1) / 100 + 1
        val reducedNumber = ((number % 100) + 100) % 100
        return Pair(reducedNumber, timesReduced)
    }

    val lines: List<String> = Files.readAllLines(Paths.get(inputFilePath))
}
