package TargetOffer;

public class Interviews_51 {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] copy = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            copy[i] = nums[i];
        }
        return reversePairsCore(nums, copy, 0, nums.length-1);
    }

    private int reversePairsCore(int[] nums, int[] copy, int left, int right){
        if (left >= right) return 0;
        int mid = (left + right) >> 1;
        int leftCount = reversePairsCore(nums, copy, left, mid);
        int rightCount = reversePairsCore(nums, copy, mid+1, right);
        int i = left, j = mid + 1, k = 0, count = 0;
        while (i <= mid && j <= right){
            if (nums[i] > nums[j]){
                copy[k++] = nums[j++];
                count += mid - i + 1;
            }else copy[k++] = nums[i++];
        }
        while (i <= mid) copy[k++] = nums[i++];
        while (j <= right) copy[k++] = nums[j++];
        for (i = 0; i < k; i++) nums[left + i] = copy[i];
        return (leftCount + rightCount + count);
    }
}
