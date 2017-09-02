package make_change;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/1/17.
 */

public class MakeChangeUnitTests {

    @Test
    public void testSubtractWorksWithOneDollar() {
        Double expected = 1.00;
        Double actual = MakeChange.subtractItemAmountFromCashReceived(5.00, 6.00);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testValidatorForNotEnoughCash() {
        Double expected = 0.00;
        Double actual = MakeChange.subtractItemAmountFromCashReceived(5.00, 4.00);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void totalDollarsToGiveChange() {
        int expected = 1;
        int actual = MakeChange.calculateTotalDollarsToReturn(1.00);
        assertEquals(expected, actual);
    }

    @Test
    public void totalQuartersToGiveChange() {
        int expected = 1;
        int actual = MakeChange.calculateQuartersToReturn(.25);
        assertEquals(expected, actual);
    }

    @Test
    public void totalDimesToGiveChange1() {
        int expected = 1;
        int actual = MakeChange.calculateDimesToReturn(.10);
        assertEquals(expected, actual);
    }

    @Test
    public void returns5dimes() {
        int expected = 5;
        int actual = MakeChange.calculateDimesToReturn(.50);
        assertEquals(expected, actual);
    }

    @Test
    public void returns1nickel() {
        int expected = 1;
        int actual = MakeChange.calculateNickelsToReturn(.05);
        assertEquals(expected, actual);
    }

    @Test
    public void returns5nickels() {
        int expected = 5;
        int actual = MakeChange.calculateNickelsToReturn(.25);
        assertEquals(expected, actual);
    }

    @Test
    public void returns1penny() {
        int expected = 1;
        int actual = MakeChange.calculatePenniesToReturn(.01);
        assertEquals(expected, actual);
    }

}

