package TargetOffer;

import java.util.HashSet;
import java.util.Set;

public class Interviews_56_1 {

    public static void main(String[] args) {
        singleNumbers(new int[]{4, 1, 4, 6});
    }

    public static int[] singleNumbers(int[] nums) {
       int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int point = xor & (-xor);
        int[] res = new int[2];
        for (int num : nums) {
            if ((point & num) == point) res[0] ^= num;
            else res[1] ^= num;
        }
        return res;
    }
}
