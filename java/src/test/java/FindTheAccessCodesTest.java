import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheAccessCodesTest {

    @Test
    public void test1() {
        assertEquals(1, FindTheAccessCodes.solution(new int[]{1, 1, 1}));
    }

    @Test
    public void test2() {
        assertEquals(3, FindTheAccessCodes.solution(new int[]{1, 2, 3, 4, 5, 6}));
    }

}