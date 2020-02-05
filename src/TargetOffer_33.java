public class TargetOffer_33 {
    public int GetUglyNumber_Solution(int n) {
        if (n < 1) return 0;
        if (n < 7) return n;
        int n2 = 0, n3 = 0, n5 = 0, tmp = 0, count = 0;
        int[] nums = new int[n];
        nums[0] = 1;
        while (count < n - 1){
            tmp = Math.min(nums[n2]*2, Math.min(nums[n3] * 3, nums[n5] * 5));
            if (tmp == nums[n2] * 2) n2++;
            if (tmp == nums[n3] * 3) n3++;
            if (tmp == nums[n5] * 5) n5++;
            nums[++count] = tmp;
        }
        return nums[n-1];
    }
}
