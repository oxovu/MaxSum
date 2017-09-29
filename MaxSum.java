public class MaxSum {

    static int[] findMaxSum(int a[]) {
        int sum = 0;
        int max = 0;
        int end = 0;
        int start = 0;
        if (a.length == 0) return new int[0];
        while (a[start] <= 0 && start != a.length - 1) {
            start++;
        }
        if (start == a.length - 1) if (a[start] <= 0) {
            return new int[0];
        } else {
            int res[] = new int[1];
            res[0] = a[start];
            return res;
        }
        for (int i = start; i < a.length; i++) {
            if (sum < 0) {
                sum = 0;
                start = i;
            }
            sum += a[i];
            if (sum > max) {
                max = sum;
                end = i;
            }
        }
        int res[] = new int[end - start + 1];
        int n = 0;
        for (int k = start; k <= end; k++) {
            res[n] = a[k];
            n++;
        }
        return res;
    }
}
