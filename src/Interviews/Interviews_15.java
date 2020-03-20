package Interviews;

import java.util.Arrays;

public class Interviews_15 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length == 0) return arr;
        int[] res = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++){
            res[i] = arr[i];
        }
        return res;
    }
}
