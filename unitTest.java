

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class unitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class unitTest
{
    /**
     * Default constructor for test class unitTest
     */
    public unitTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void ClockCompareTrue()
    {
        ClockTime clockTim1 = new ClockTime(11, 01, 01);
        ClockTime clockTim2 = new ClockTime(11, 01, 01);
        TestClockTime.printEquals(clockTim1, clockTim2);
    }

    @Test
    public void ClockCompareFalse()
    {
        ClockTime clockTim1 = new ClockTime(1, 1, 1);
        ClockTime clockTim2 = new ClockTime(2, 2, 2);
        TestClockTime.printEquals(clockTim1, clockTim2);
    }

    @Test
    public void TestRolloverValues()
    {
        ClockTime clockTim1 = new ClockTime(1, 1, 1);
        ClockTime clockTim2 = new ClockTime(0, 61, 1);
        TestClockTime.printEquals(clockTim1, clockTim2);
    }

    @Test
    public void IfNegative()
    {
        ClockTime clockTim1 = new ClockTime(-40, 0, 0);
        ClockTime clockTim2 = new ClockTime(-50, 0, 0);
        TestClockTime.printEquals(clockTim1, clockTim2);
        TestClockTime.printEquals(clockTim1, clockTim2);
    }
}




