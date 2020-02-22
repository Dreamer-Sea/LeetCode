package Tencent;

public class Tencent_7 {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) return 0;
        int max = 0, tmp, min;
        int i =0, j = height.length - 1;
        while (i < j){
            min = height[i] < height[j] ? height[i] : height[j];
            tmp = min * (j - i);
            if (max < tmp) max = tmp;
            if (height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
        return max;
    }
}
