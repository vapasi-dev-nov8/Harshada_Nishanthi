import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AreaCalculatorTest {
    @Test
    void shouldCalculateAreaOfRectangle(){
        assertEquals(15,AreaCalculator.calculate(5,3));
    }
}
