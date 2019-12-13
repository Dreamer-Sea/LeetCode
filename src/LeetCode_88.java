public class LeetCode_88 {

    public static void main(String[] args) {
        LeetCode_88 p = new LeetCode_88();
        p.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{4, 5, 6}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n){
        if (nums1.length == 0 && nums1.length == 0) return;
        m--; n--;
        for (int k = nums1.length - 1; k >= 0; k--){
            if (m >= 0 && n >= 0){
                if (nums1[m] < nums2[n]){
                    nums1[k] = nums2[n--];
                }else{
                    nums1[k] = nums1[m--];
                }
            }
            else if (m >= 0){
                nums1[k] = nums1[m--];
            }else{
                nums1[k] = nums2[n--];
            }
        }
    }
}
