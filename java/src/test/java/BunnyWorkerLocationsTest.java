import org.junit.Test;

import static org.junit.Assert.*;

public class BunnyWorkerLocationsTest {

    @Test
    public void test1() {
        assertEquals("9", BunnyWorkerLocations.solution(3, 2));
    }

    @Test
    public void test2() {
        assertEquals("96", BunnyWorkerLocations.solution(5, 10));
    }

}