package Sort;

public class MergeSort {

    public static void main(String[] args) {
        MergeSort p = new MergeSort();
        int[] nums = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] copy = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        p.sort(nums, copy, 0, nums.length - 1);
        for (int n : nums)
            System.out.print(n + " ");
    }

    public void sort(int[] nums, int[] copy, int left, int right){
        if (left >= right) return;
        int mid = (left + right) >> 1;
        sort(nums, copy, left, mid);
        sort(nums, copy, mid+1, right);
        int i = mid, j = right, locCopy = right;
        while (i >= left && j > mid){
            if (nums[i] > nums[j])
                copy[locCopy--] = nums[i--];
            else
                copy[locCopy--] = nums[j--];
        }
        while (i >= left) copy[locCopy--] = nums[i--];
        while (j > mid) copy[locCopy--] = nums[j--];
        for (i = 0; i < nums.length; i++)
            nums[i] = copy[i];
    }
}
