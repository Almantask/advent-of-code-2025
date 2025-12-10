package day1

import java.nio.file.Files
import java.nio.file.Paths

class Part1(inputFilePath: String) {
    var sequence: Int = 50

    fun solve(): Int {
        var password = 0
        for (line in lines){
            val rotation = Rotation.fromText(line)
            sequence += rotation
            if(sequence > 99){
                sequence %= 100
            }
            if(sequence < 0){
                sequence = (100 + sequence) % 100
            }

            if(sequence == 0){
                password += 1
            }
            println(sequence)
        }

        return password
    }

    val lines: List<String> = Files.readAllLines(Paths.get(inputFilePath))
}
