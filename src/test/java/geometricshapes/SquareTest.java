package geometricshapes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    BasicShape square = new Square(3.0);
    @Test
    void shouldCalculateAreaOfSquare(){

        assertEquals(9, square.calculateArea());
    }
    @Test
    void shouldCalculatePerimeterOfSquare(){

        assertEquals(12, square.calculatePerimeter());
    }
    @ParameterizedTest
    @MethodSource("provideLengthBreadthAndArea")
    void shouldCalculateAreaOfSquareParameterised(double length, double expectedArea) {
        // Given
        BasicShape square = new Square(length);

        // When
        double actualArea = square.calculateArea();

        // Then
        assertEquals(expectedArea, actualArea);
    }

    private static Stream<Arguments> provideLengthBreadthAndArea() {
        return Stream.of(
                Arguments.of(2.0, 4.0),
                Arguments.of(0.0, 0.0)
        );
    }
}
