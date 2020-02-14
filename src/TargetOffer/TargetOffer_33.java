package TargetOffer;

public class TargetOffer_33 {
    public int GetUglyNumber_Solution(int n) {
        if (n < 1) return 0;
        if (n < 7) return n;
        int i2 = 0, i3 = 0, i5 = 0, count = 0, tmp;
        int[] nums = new int[n];
        nums[0] = 1;
        while (count < n - 1){
            tmp = Math.min(Math.min(nums[i2] * 2, nums[i3] * 3), nums[i5] * 5);
            if (tmp == nums[i2] * 2) i2++;
            if (tmp == nums[i3] * 3) i3++;
            if (tmp == nums[i5] * 5) i5++;
            nums[++count] = tmp;
        }
        return nums[n-1];
    }
}
