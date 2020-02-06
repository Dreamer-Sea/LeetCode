public class TargetOffer_35 {
    public int InversePairs(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] copy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) copy[i] = nums[i];
        return InversePairsCore(copy, nums, 0, nums.length-1);
    }

    private int InversePairsCore(int[] copy, int[] nums, int low, int high){
        if (low == high) return 0;
        int mid = (low + high) >> 1;
        int leftCount = InversePairsCore(copy, nums, low, mid);
        int rightCount = InversePairsCore(copy, nums, mid+1, high);
        int count = 0, i = mid, j = high, locCopy = high;
        while (i >= low && j > mid){
            if (nums[i] > nums[j]){
                copy[locCopy--] = nums[i--];
                count += j - mid;
                if (count >= 1000000007) count %= 1000000007;
            }else
                copy[locCopy--] = nums[j--];
        }
        while (i >= low) copy[locCopy--] = nums[i--];
        while (j > mid) copy[locCopy--] = nums[j--];
        for (int s = low; s <= high; s++) nums[s] = copy[s];
        return (leftCount + rightCount + count) % 1000000007;
    }
}
