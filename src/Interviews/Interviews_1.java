package Interviews;

import java.util.ArrayList;

public class Interviews_1 {
    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> res = new ArrayList<>();
        int i = 1, j = 2;
        int[] tmp;
        while (i <= target / 2){
            int sum = (j + i) * (j - i + 1) / 2;
            if (sum == target){
                tmp = new int[j - i + 1];
                for (int k = i; k <= j; k++){
                    tmp[k-i] = k;
                }
                res.add(tmp);
                sum -= i;
                i++;
            }else if (sum > target) i++;
            else j++;
        }
        return res.toArray(new int[res.size()][]);
    }
}
