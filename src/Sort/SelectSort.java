package Sort;

public class SelectSort {
    public void sort(int[] nums){
        if (nums == null || nums.length == 0) return;
        int tmp, min;
        for (int i = 0; i < nums.length; i++){
            min = i;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[min] > nums[j]) min = j;
            }
            if (min != i){
                tmp = nums[min];
                nums[min] = nums[i];
                nums[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        int[] nums = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        selectSort.sort(nums);
        for (int n : nums)
            System.out.print(n + " ");
    }
}
