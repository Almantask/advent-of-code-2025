package day1

import java.nio.file.Files
import java.nio.file.Paths

class Part2(inputFilePath: String) {
    var sequence: Int = 50

    fun solve(): Int {
        var password = 0
        for (line in lines){
            val rotation = Rotation.fromText(line)
            sequence += rotation
            if(sequence > 99){
                val (reduced, timesFullRotation) = reducePositive(sequence)
                sequence = reduced
                password += timesFullRotation
            }
            var reducedFromNegative = false
            if(sequence < 0){
                val (reduced, timesFullRotation) = reduceNegative(sequence)
                sequence = reduced
                password += timesFullRotation
                reducedFromNegative = true
            }
            println(sequence)
            if(!reducedFromNegative && sequence == 0){
                continue
            }

            if(sequence == 0){
                password += 1
            }

        }

        return password
    }

    fun reducePositive(number: Int): Pair<Int, Int> {
        var reducedNumber = number
        var timesReduced = 0
        while(reducedNumber > 99){
            reducedNumber -= 100
            timesReduced += 1
        }

        return Pair(reducedNumber, timesReduced)
    }

    fun reduceNegative(number: Int): Pair<Int, Int> {
        var reducedNumber = number
        var timesReduced = 0
        while(reducedNumber < 0){
            reducedNumber += 100
            timesReduced += 1
        }

        return Pair(reducedNumber, timesReduced)
    }

    val lines: List<String> = Files.readAllLines(Paths.get(inputFilePath))
}
