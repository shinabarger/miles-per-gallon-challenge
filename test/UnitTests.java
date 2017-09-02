import averager.GetAverage;
import gas_mileage.GasMileage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/1/17.
 */

public class UnitTests {

    @Test
    public void firstTest() {
        String expected = "Test";
        String actual = "Test";
        assertEquals(expected, actual);
    }

    @Test
    public void returnsAValue() {
        Boolean expected = true;
        boolean returnsValue = false;

        GasMileage.returnMilesPerGallon(0, 0);
        if (GasMileage.returnMilesPerGallon(0.0, 0.0) >= 0) {
            returnsValue = true;
        } else returnsValue = false;

        assertEquals(expected, returnsValue);

    }

    @Test
    public void returns1mpg() {
        double expected = 1.0;
        double actual = (GasMileage.returnMilesPerGallon(1, 1));
        assertEquals(expected, actual, 1);
    }

    @Test
    public void returns5mpg() {
        double expected = 5.0;
        double actual = (GasMileage.returnMilesPerGallon(50, 10));
        assertEquals(expected, actual, 1);
    }

    @Test
    public void returns100mpg() {
        double expected = 100.0;
        double actual = (GasMileage.returnMilesPerGallon(100, 1));
        assertEquals(expected, actual, 1);
    }

    @Test
    public void returnsAverageAs1() {
        double expected = 1.0;
        double actual = GetAverage.calculateAverage(1, 1,1);
        assertEquals(expected, actual, 1);
    }

    @Test
    public void returnsAverageAs15() {
        double expected = 15.0;
        double actual = GetAverage.calculateAverage(10, 15,20);
        assertEquals(expected, actual, 1);
    }

}

