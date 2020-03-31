package LeetCode;

public class LeetCode_42 {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int n = height.length, l_max = height[0], r_max = height[n-1], res = 0, left = 0, right = n - 1;
        while (left <= right){
            l_max = Math.max(l_max, height[left]);
            r_max = Math.max(r_max, height[right]);
            if (l_max < r_max){
                res += l_max - height[left++];
            }else{
                res += r_max - height[right--];
            }
        }
        return res;
    }
}
