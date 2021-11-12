package geometricshapes;

import geometricshapes.Rectangle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    BasicShape rectangle = new Rectangle(3.0,5.0);
    @Test
    void shouldCalculateAreaOfRectangle(){

        assertEquals(15, rectangle.calculateArea());
    }
    @Test
    void shouldCalculatePerimeterOfRectangle(){

        assertEquals(16, rectangle.calculatePerimeter());
    }
    @ParameterizedTest
    @MethodSource("provideLengthBreadthAndArea")
    void shouldCalculateAreaOfRectangleParameterised(double length, double width, double expectedArea) {
        // Given
        Rectangle rectangle = new Rectangle(length, width);

        // When
        double actualArea = rectangle.calculateArea();

        // Then
        assertEquals(expectedArea, actualArea);
    }

    private static Stream<Arguments> provideLengthBreadthAndArea() {
        return Stream.of(
                Arguments.of(2.0, 3.0, 6.0),
                Arguments.of(2.0, 0.0, 0.0),
                Arguments.of(0.0, 3.0, 0.0)
        );
    }
}
