package Tencent;

public class Tencent_2 {

    public static void main(String[] args) {
        int[] nums1 = {3, 4};
        int[] nums2 = {};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if (m == 0){
            if (n % 2 == 0){
                return (nums2[n/2] + nums2[n/2-1]) / 2.0;
            }else return nums2[n/2];
        }
        if (n == 0){
            if (m % 2 == 0){
                return (nums1[m/2] + nums1[m/2-1]) / 2.0;
            }else return nums1[m/2];
        }
        int[] nums = new int[m+n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n){
            nums[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < m) nums[k++] = nums1[i++];
        while (j < n) nums[k++] = nums2[j++];
        if ((m+n) % 2 == 0){
            return (nums[(m+n)/2] + nums[(m+n)/2-1]) / 2.0;
        }else return nums[(m+n) / 2];
    }
}
