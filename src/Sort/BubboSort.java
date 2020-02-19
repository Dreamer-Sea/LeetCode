package Sort;

public class BubboSort {
    public void sort(int[] nums){
        if (nums == null || nums.length == 0) return;
        int tmp;
        boolean swap = false;
        for (int i = nums.length - 1; i >= 0; i--){
            for (int j = 0; j < i; j++){
                if (nums[j] > nums[j+1]){
                    tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }

    public static void main(String[] args) {
        BubboSort bubboSort = new BubboSort();
        int[] nums = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        bubboSort.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
