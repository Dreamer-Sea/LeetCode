package TargetOffer;

public class Interviews_40 {

    public static void main(String[] args) {
        Interviews_40 p = new Interviews_40();
        int[] arr = {0, 1, 2, 1};
        p.getLeastNumbers(arr, 1);
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length == 0) return arr;
        heapSort(arr);
        int[] res = new int[k];
        for (int i = 0; i < k; i++){
            res[i] = arr[i];
        }
        return res;
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
