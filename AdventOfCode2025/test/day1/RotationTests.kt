package day1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RotationTests {
    @Test
    fun fromText_whenRight90_returns90() {
        // Act
        val rotation = Rotation.fromText("R90")

        // Assert
        assertThat(rotation).isEqualTo(90)
    }

    @Test
    fun fromText_whenLeft90_returnsNegative90() {
        // Act
        val rotation = Rotation.fromText("L90")

        // Assert
        assertThat(rotation).isEqualTo(-90)
    }
}