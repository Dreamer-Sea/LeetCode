import java.util.PriorityQueue;

public class LeetCode_215 {

    public static void main(String[] args) {
        LeetCode_215 p = new LeetCode_215();
        System.out.println(p.findKthLargest(new int[]{3,2,1,5,6,4}, 2));;
    }

    public int findKthLargest(int[] nums, int k){
//        quickSort(nums, 0, nums.length-1);

//        for (int n : nums){
//            System.out.print(n + " ");
//        }

//        return nums[k-1];
        heapSort(nums);
        return nums[nums.length - k];
    }

    private void quickSort(int[] nums, int left, int right){
        if (left >=right) return;
        int i = left, j = right, pivot = nums[left];
        while (i < j){
            while (i < j && pivot >= nums[j]) j--;
            nums[i] = nums[j];
            while (i < j && pivot <= nums[i]) i++;
            nums[j] = nums[i];
        }
        nums[i] = pivot;
        quickSort(nums, left, j-1);
        quickSort(nums, j+1, right);
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

    private void adjustHeap(int[] nums, int i, int len){
        int left, right, j;
        left = 2 * i + 1;
        while (left <= len){
            right = left + 1;
            j = left;
            if (j < len && nums[left] < nums[right]) j++;
            if (nums[i] < nums[j]){
                swap(nums, i, j);
                i = j;
                left = 2 * i + 1;
            }else break;
        }
    }

    private void swap(int[] nums, int x, int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}
