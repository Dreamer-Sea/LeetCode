package Interviews;

public class Interviews_6 {
    public boolean canThreePartsEqualSum(int[] A) {
        if (A == null || A.length == 0) return true;
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        if (sum % 3 != 0) return false;
        int count = 0, tmp = 0;
        for (int i : A) {
            tmp += i;
            if (tmp == sum / 3){
                tmp = 0;
                count++;
            }
        }
        return count == 3;
    }
}
