package TargetOffer;

public class TargetOffer_46 {
    public int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1) return -1;
        int count = n, step = 0, i = -1;
        int[] nums = new int[n];
        while (count > 0){
            i++;
            if (i == n) i = 0;
            if (nums[i] == -1) continue;
            step++;
            if (step == m){
                nums[i] = -1;
                step = 0;
                count--;
            }
        }
        return i;
    }
}
