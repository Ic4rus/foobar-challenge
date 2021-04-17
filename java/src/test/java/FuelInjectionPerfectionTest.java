import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuelInjectionPerfectionTest {

    @Test
    public void test1() {
        assertEquals(5, FuelInjectionPerfection.solution("15"));
    }

    @Test
    public void test2() {
        assertEquals(2, FuelInjectionPerfection.solution("4"));
    }
}