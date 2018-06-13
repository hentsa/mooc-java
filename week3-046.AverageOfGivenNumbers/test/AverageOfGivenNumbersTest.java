import fi.helsinki.cs.tmc.edutestutils.Points;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import static org.powermock.api.easymock.PowerMock.*;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.rule.PowerMockRule;

@Points("46")
@PrepareForTest(AverageOfGivenNumbers.class)
//@RunWith(PowerMockRunner.class)
public class AverageOfGivenNumbersTest {
    @Rule
    public PowerMockRule p = new PowerMockRule();

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    

    @Test
    public void averageRight1() {
        assertEquals("Average not correct for values -12, 2, 8 and 0, check that you make correct type conversions",
                -0.5, AverageOfGivenNumbers.average(-12, 2, 8, 0), 0.0001);
    }

    @Test
    public void averageRight2() {
        assertEquals("Average not correct for values 1, 2, 3 and 4, check that you make correct type conversions",
                2.5, AverageOfGivenNumbers.average(1, 2, 3, 4), 0.0001);
    }
    
    @Test
    public void helperMethodUsed1() {
        mockStaticPartial(AverageOfGivenNumbers.class, "sum");
        reset(AverageOfGivenNumbers.class);

        AverageOfGivenNumbers.sum(1,2,3,4);
        expectLastCall().andReturn(10);

        replay(AverageOfGivenNumbers.class);       

        try {
            AverageOfGivenNumbers.average(1,2,3,4);
            verifyAll();
        } catch (AssertionError e) {
            fail("method average should use the method sum to calculate the sum of it's parameters"
                    + "\n"
                    + "the method sum should be called exactly once. "            
                    + "When called average(1,2,3,4) " + e);
        }

    }
        
    public void helperMethodUsed2() {
        mockStaticPartial(AverageOfGivenNumbers.class, "sum");
        reset(AverageOfGivenNumbers.class);

        AverageOfGivenNumbers.sum(4,2,3,7);
        expectLastCall().andReturn(16);

        replay(AverageOfGivenNumbers.class);       

        try {
            AverageOfGivenNumbers.average(4,2,3,7);
            verifyAll();
        } catch (AssertionError e) {
            fail("method average should use the method sum to calculate the sum of it's parameters"
                    + "\n"
                    + "the method sum should be called exactly once. "            
                    + "When called average(4,2,3,7) " + e);
        }

    }        

    /**
     * Test of sum method, of class AverageOfGivenNumbers.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int expResult = 0;
        int result = AverageOfGivenNumbers.sum(number1, number2, number3, number4);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of average method, of class AverageOfGivenNumbers.
     */
    @Test
    public void testAverage() {
        System.out.println("average");
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        double expResult = 0.0;
        double result = AverageOfGivenNumbers.average(number1, number2, number3, number4);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AverageOfGivenNumbers.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AverageOfGivenNumbers.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
