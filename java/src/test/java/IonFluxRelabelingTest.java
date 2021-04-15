import org.junit.Test;

import static org.junit.Assert.*;

public class IonFluxRelabelingTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{21, 15, 29}, IonFluxRelabeling.solution(5, new int[]{19, 14, 28}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{-1, 7, 6, 3}, IonFluxRelabeling.solution(3, new int[]{7, 3, 5, 1}));
    }

}