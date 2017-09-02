import averager.GetAverage;
import gas_mileage.GasMileage;
import jar.Jar;
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
        String expected = "1.0";
        String actual = GetAverage.calculateAverage(1, 1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void returnsAverageAs15() {
        String expected = "15.0";
        String actual = GetAverage.calculateAverage(10, 15, 20);
        assertEquals(expected, actual);
    }

    @Test
    public void returnsAverageAs1667() {
        String expected = "16.67";
        String actual = GetAverage.calculateAverage(11, 15, 24);
        assertEquals(expected, actual);
    }

    @Test
    public void returnsAverageAs1667asString() {
        String expected = "16.67";
        String actual = GetAverage.calculateAverage(11, 15, 24);
        assertEquals(expected, actual);
    }

    @Test
    public void returns25CentsFor1Quarter() {
        double expected = 0.25;
        double actual = Jar.calculateQuarterAmount(1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void returns10CentsFor1Dime() {
        double expected = 0.10;
        double actual = Jar.calcualateDimeAmount(1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void returns5CentsFor1Nickel() {
        double expected = 0.05;
        double actual = Jar.calcualateNickelAmount(1);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void returns1CentsFor1Penny() {
        double expected = 0.01;
        double actual = Jar.calcualatePenniesAmount(1);
        assertEquals(expected, actual, 0.01);
    }

}

