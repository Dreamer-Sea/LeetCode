package Sort;

public class InsertionSort {
    public void sort(int[] nums){
        if (nums == null || nums.length == 0) return;
        int pos, val;
        for (int i = 1; i < nums.length; i++){
            pos = i;
            val = nums[i];
            while (pos > 0 && nums[pos-1] > val){
                nums[pos] = nums[pos - 1];
                pos--;
            }
            nums[pos] = val;
        }
    }

    public static void main(String[] args) {
        InsertionSort p = new InsertionSort();
        int[] nums = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        p.sort(nums);
        for (int n : nums)
            System.out.print(n + " ");
    }
}
