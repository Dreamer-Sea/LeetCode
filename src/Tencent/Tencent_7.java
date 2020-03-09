package Tencent;

public class Tencent_7 {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) return 0;
        int i = 0, j = height.length - 1;
        int max = Integer.MIN_VALUE, tmp = 0;
        while (i < j){
            tmp = (j - i) * Math.min(height[i], height[j]);
            if (tmp > max) max = tmp;
            if (height[i] > height[j]) j--;
            else i++;
        }
        return max;
    }
}
