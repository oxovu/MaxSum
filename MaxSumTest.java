import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxSumTest {

    int input[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int input1[] = {6, 3, 90, 88, -200, 2, 333};
    int input2[] = {};
    int input3[] = {-9, -12, -23, 0, -4, -9};
    int input4[] = {10, 22, 11, 1, 0, 9, 6};
    int input5[] = {-1, -2, -3, -4, -5, 100};
    int input6[] = {-5, -5, 10, 10, 10, -5, -5};

    int res[] = {4, -1, 2, 1};
    int res1[] = {2, 333};
    int res2[] = {};
    int res3[] = {};
    int res4[] = {10, 22, 11, 1, 0, 9, 6};
    int res5[] = {100};
    int res6[] = {10, 10, 10};

    @Test
    public void maxSumTest() {
        assertArrayEquals(res, MaxSum.findMaxSum(input));
        assertArrayEquals(res1, MaxSum.findMaxSum(input1));
        assertArrayEquals(res2, MaxSum.findMaxSum(input2));
        assertArrayEquals(res3, MaxSum.findMaxSum(input3));
        assertArrayEquals(res4, MaxSum.findMaxSum(input4));
        assertArrayEquals(res5, MaxSum.findMaxSum(input5));
        assertArrayEquals(res6, MaxSum.findMaxSum(input6));

    }
}