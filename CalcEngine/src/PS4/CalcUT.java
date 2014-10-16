package PS4;

import static org.junit.Assert.*;
import PS4.CalcEngine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcUT {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public final void FutureValue1() {

        // assertEquals("message", expected value, found value)
        assertEquals("The answer should be $11022.66.", "11022.66",
                PS4.CalcEngine.Calculation(10000, 3, 3.25));
    }

    @Test
    public final void FutureValue2() {

        assertEquals("The answer should be $164.84.", "164.84",
        		PS4.CalcEngine.Calculation(100, 50, 1));
    }

    @Test
    public final void FutureValue3() {

        assertEquals("The answer should be $73271.97.", "73271.97",
        		PS4.CalcEngine.Calculation(60000, 10, 2));
    }
}