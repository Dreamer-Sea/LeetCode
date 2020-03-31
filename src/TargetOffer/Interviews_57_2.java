package TargetOffer;

import java.util.ArrayList;

public class Interviews_57_2 {
    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> res = new ArrayList<>();
        if (target < 3) return new int[0][0];
        int[] tmp;
        int i = 1, j = 2, sum;
        while (i <= target / 2){
            sum = (j + i) * (j - i + 1) / 2;
            if (sum == target){
                tmp = new int[j - i + 1];
                for (int k = i; k <= j; k++) tmp[k-i] = k;
                res.add(tmp);
                i++;
            }else if (sum > target) i++;
            else j++;
        }
        return res.toArray(new int[res.size()][]);
    }
}
