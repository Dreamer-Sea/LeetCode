package Sort;

public class QuickSort {
    public void sort(int[] nums, int left, int right){
        if (nums == null || left >= right) return;
        int i = left, j = nums.length - 1, pivot = nums[i];
        while (i < j){
            while (i < j && pivot <= nums[j]) j--;
            nums[i] = nums[j];
            while (i < j && pivot >= nums[i]) i++;
            nums[j] = nums[i];
        }
        nums[i] = pivot;
        sort(nums, left, j-1);
        sort(nums, j+1, right);
    }

    public static void main(String[] args){
        QuickSort p = new QuickSort();
        int[] nums = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        p.sort(nums, 0, nums.length-1);
        for (int n : nums)
            System.out.print(n + " ");
    }
}
