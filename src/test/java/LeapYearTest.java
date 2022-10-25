import org.junit.Test;
import static org.junit.Assert.*;


    public class LeapYearTest {
        //test for when its not leap year
        @Test
        public void testLeapYearWhenDivisibleby4AndNot100() {
            assertTrue(Prog.isLeapYear(4));

        }

        @Test
        public void testLeapYearWhenDivisibleby400() {
            assertTrue(Prog.isLeapYear(400));

        }

        //test for when its not leap year
        @Test
        public void testNotLeapYearWhendivisibleBy4() {
            assertFalse(Prog.isLeapYear(5));

        }

        @Test
        public void testNotLeapYearWhenDivisibleBy100AndNot400() {
            assertFalse(Prog.isLeapYear(100));
        }

    }