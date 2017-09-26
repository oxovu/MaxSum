import java.util.ArrayList;

public class MaxSum {

    static ArrayList<Integer> findBestDays(int a[]) {
        int sum = 0;
        int max = 0;
        int end = 0;
        int start = 0;
        ArrayList<Integer> res = new ArrayList<>();
        if (a.length == 0) return res;
        while (a[start] < 0 && start != a.length - 1) {
            start++;
        }
        if (start == a.length - 1) return res;
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
        for (int k = start; k <= end; k++) res.add(a[k]);
        return res;
    }
}
