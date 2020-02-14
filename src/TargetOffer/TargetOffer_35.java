package TargetOffer;

public class TargetOffer_35 {
    public int InversePairs(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] copy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) copy[i] = nums[i];
        return InversePairsCore(nums, copy, 0, nums.length-1);
    }

    private int InversePairsCore(int[] nums, int[] copy, int left, int right){
        if (left == right) return 0;
        int mid = (left + right) >> 1;
        int leftCount = InversePairsCore(nums, copy, left, mid);
        int rightCount = InversePairsCore(nums,copy,  mid+1, right);
        int i = mid, j = right, locCopy = right, count = 0;
        while (i >= left && j > mid){
            if (nums[i] > nums[j]){
                copy[locCopy--] = nums[i--];
                count += j - mid;
                if (count >= 1000000007) count %= 1000000007;
            }else copy[locCopy--] = nums[j--];
        }
        while (i >= left) copy[locCopy--] = nums[i--];
        while (j > mid) copy[locCopy--] = nums[j--];
        for (i = left; i <= right; i++){
            nums[i] = copy[i];
        }
        return (count + leftCount + rightCount) % 1000000007;
    }

}
