package Sort;

public class HeapSort {

    public static void main(String[] args) {
        HeapSort p = new HeapSort();
        int[] nums = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        p.sort(nums);
        for (int n : nums)
            System.out.print(n + " ");
    }

    public void sort(int[] nums){
        int last = nums.length - 1;
        for (int i = (last - 1) / 2; i >= 0; i--){
            adjustHeap(nums, i, last);
        }
        while (last >= 0){
            swap(nums, 0, last--);
            adjustHeap(nums, 0, last);
        }
    }

    private void adjustHeap(int[] nums, int i, int len){
        int left, right, j;
        left = i * 2 + 1;
        while (left <= len){
            right = left + 1;
            j = left;
            if (j < len && nums[left] < nums[right]) j++;
            if (nums[i] < nums[j]){
                swap(nums, i, j);
                i = j;
                left = i * 2 + 1;
            }else break;
        }
    }

    private void swap(int[] nums, int x, int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}
