package Lab11;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Lab11Test {

    @Test
    public void testCalculateProgression() {
        int result = Lab11.calculateProgression(1, 11, 20);
        int expectedResult = 400;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSortValues() {
        int[] result =  Lab11.sortValues(3, 1, 2);
        int[] expectedResult = {1,2,3};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testPositiveResult() {
        double result = Lab11.sumOfExpression(0.1);
        assertTrue(result >= 0);
    }

    @Test
    public void testEvenIndicesWithZeros() {
        int[] result = Lab11.fillEvenIndicesWithZeros();
        assertEquals(0, result[0]);
        assertEquals(0, result[2]);
        assertEquals(0, result[4]);
    }

    @Test
    public void testMaxValue() {
        double result = Lab11.maxValueOfFunction(-1, 3);
        double expectedResult = 8.0;
        assertEquals(expectedResult, result);
    }
}
