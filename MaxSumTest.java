import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MaxSumTest{

    int price[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int price1[] = {6, 3, 90, 88, -200, 2, 333};
    int price2[] = {};
    int price3[] = {-9, -12, -23, 0, -4, -9};
    int price4[] = {10, 22, 11, 1, 0, 9, 6};

    List<Integer> res = Arrays.asList(4, -1, 2, 1);
    List<Integer> res1 = Arrays.asList(2, 333);
    List<Integer> res2 = Arrays.asList();
    List<Integer> res3 = Arrays.asList();
    List<Integer> res4 = Arrays.asList(10, 22, 11, 1, 0, 9, 6);

    @Test
    public void maxSumTest() {
        assertEquals(MaxSum.findBestDays(price), res);
        assertEquals(MaxSum.findBestDays(price1), res1);
        assertEquals(MaxSum.findBestDays(price2), res2);
        assertEquals(MaxSum.findBestDays(price3), res3);
        assertEquals(MaxSum.findBestDays(price4), res4);
    }
}