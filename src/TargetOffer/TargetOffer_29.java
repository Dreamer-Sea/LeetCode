package TargetOffer;

import java.util.ArrayList;

public class TargetOffer_29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] nums, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length) return res;
        headSort(nums);
        for (int i = 0; i < k; i++){
            res.add(nums[i]);
        }
        return res;
    }

    private void headSort(int[] nums){
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
        left = i * 2 + 1;
        while (left <= last){
            right = left + 1;
            j = left;
            if (j < last && nums[left] < nums[right]) j++;
            if (nums[i] < nums[j]){
                swap(nums, i, j);
                i = j;
                left = i * 2 + 1;
            }else break;
        }
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}