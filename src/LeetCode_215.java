public class LeetCode_215 {
    public int findKthLargest(int[] nums, int k){
        if (nums.length == 0 || k < 1) return 0;
        heapSort(nums);
        return nums[nums.length - k];
    }

    private void heapSort(int[] nums){
        int last = nums.length - 1;
        for (int i = (last - 1) / 2; i >= 0; i--){
            adjustHeap(nums, i, last);
        }
        while (last >= 0){
            swap(nums, 0, last--);
            adjustHeap(nums, 0, last);
        }
    }

    private void adjustHeap(int[] nums, int i, int last){
        int left, right, j;
        left = 2 * i + 1;
        while (left <= last){
            right = left + 1;
            j = left;
            if (j < last && nums[left] < nums[right]) j++;
            if (nums[i] < nums[j]){
                swap(nums, i, j);
                i = j;
                left = 2 * i + 1;
            }else break;
        }
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
