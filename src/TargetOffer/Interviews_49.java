package TargetOffer;

public class Interviews_49 {
    public int nthUglyNumber(int n) {
        if (n < 1) return 0;
        if (n < 7) return n;
        int n2 = 0, n3 = 0, n5 = 0, count = 0, tmp;
        int[] nums = new int[n];
        nums[0] = 1;
        while (count < n - 1){
            tmp = Math.min(Math.min(nums[n2] * 2, nums[n3] * 3), nums[n5] * 5);
            if (tmp == nums[n2] * 2) n2++;
            if (tmp == nums[n3] * 3) n3++;
            if (tmp == nums[n5] * 5) n5++;
            nums[++count] = tmp;
        }
        return nums[n-1];
    }
}
