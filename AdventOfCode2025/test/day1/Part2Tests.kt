package day1

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.*

class Part2Tests {
    @Test
    fun newPart2_readsFile() {
        // Act
        val passwordSolver = Part2("testData/day1/Example.txt")

        // Assert
        assertThat(passwordSolver.lines).isNotEmpty()
    }

    @Test
    fun solvePassword_whenExampleInput_returns6() {
        // Arrange
        val passwordSolver = Part2("testData/day1/Example.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(6)
    }

    @Test
    fun solvePassword_whenL1Input_returns0() {
        // Arrange
        val passwordSolver = Part2("testData/day1/L1.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(0)
    }

    @Test
    fun solvePassword_whenR1Input_returns0() {
        // Arrange
        val passwordSolver = Part2("testData/day1/R1.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(0)
    }

    @Test
    fun solvePassword_whenL50L1Input_returns1() {
        // Arrange
        val passwordSolver = Part2("testData/day1/L50L1.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(1)
    }

    @Test
    fun solvePassword_whenR49R1Input_returns1() {
        // Arrange
        val passwordSolver = Part2("testData/day1/R49R1.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(1)
    }

    @Test
    fun solvePassword_whenR49R1Input_sequenceIs0() {
        // Arrange
        val passwordSolver = Part2("testData/day1/R49R1.txt")

        // Act
        passwordSolver.solve()

        // Assert
        assertThat(passwordSolver.sequence).isEqualTo(0)
    }

    @Test
    fun solvePassword_whenR51Input_sequenceIs1() {
        // Arrange
        val passwordSolver = Part2("testData/day1/R51.txt")

        // Act
        passwordSolver.solve()

        // Assert
        assertThat(passwordSolver.sequence).isEqualTo(1)
    }

    @Test
    fun solvePassword_whenR51Input_passwordIs1() {
        // Arrange
        val passwordSolver = Part2("testData/day1/R51.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(1)
    }

    @Test
    fun solvePassword_whenL51Input_passwordIs1() {
        // Arrange
        val passwordSolver = Part2("testData/day1/R51.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(1)
    }

    @Test
    fun solvePassword_whenL150Input_sequenceIs0() {
        // Arrange
        val passwordSolver = Part2("testData/day1/L150.txt")

        // Act
        passwordSolver.solve()

        // Assert
        assertThat(passwordSolver.sequence).isEqualTo(0)
    }

    @Test
    fun solvePassword_whenL250Input_sequenceIs0() {
        // Arrange
        val passwordSolver = Part2("testData/day1/L250.txt")

        // Act
        passwordSolver.solve()

        // Assert
        assertThat(passwordSolver.sequence).isEqualTo(0)
    }

    @Test
    fun solvePassword_whenR150Input_sequenceIs0() {
        // Arrange
        val passwordSolver = Part2("testData/day1/R150.txt")

        // Act
        passwordSolver.solve()

        // Assert
        assertThat(passwordSolver.sequence).isEqualTo(0)
    }

    @Test
    fun solvePassword_whenR250Input_sequenceIs0() {
        // Arrange
        val passwordSolver = Part2("testData/day1/R250.txt")

        // Act
        passwordSolver.solve()

        // Assert
        assertThat(passwordSolver.sequence).isEqualTo(0)
    }

    @Test
    fun solvePassword_whenL150Input_passwordIs2() {
        // Arrange
        val passwordSolver = Part2("testData/day1/L150.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(2)
    }

    @Test
    fun solvePassword_whenR150Input_passwordIs2() {
        // Arrange
        val passwordSolver = Part2("testData/day1/R150.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(2)
    }

    @Test
    fun solvePassword_whenL250Input_passwordIs2() {
        // Arrange
        val passwordSolver = Part2("testData/day1/L250.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(3)
    }

    @Test
    fun solvePassword_whenR250Input_passwordIs2() {
        // Arrange
        val passwordSolver = Part2("testData/day1/R250.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(3)
    }

    @Test
    fun solvePassword_whenR1000Input_passwordIs2() {
        // Arrange
        val passwordSolver = Part2("testData/day1/R1000.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(10)
    }

    @Test
    fun solvePassword_whenL1000Input_passwordIs2() {
        // Arrange
        val passwordSolver = Part2("testData/day1/L1000.txt")

        // Act
        val password = passwordSolver.solve()

        // Assert
        assertThat(password).isEqualTo(10)
    }
}
