import java.util.ArrayList;

public class TargetOffer_29 {

    public static void main(String[] args) {
        TargetOffer_29 p = new TargetOffer_29();
        int[] nums = {4,5,1,6,2,7,3,8};
        p.GetLeastNumbers_Solution(nums, 4);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] nums, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (nums.length == 0 || nums == null || k < 1 || k > nums.length) return res;
        heapSort(nums);
        for (int i = 0; i < k; i++){
            res.add(nums[i]);
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

    private void swap (int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
