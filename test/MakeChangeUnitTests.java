import make_change.MakeChange;
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



}

