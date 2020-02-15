package TargetOffer;

import java.util.ArrayList;

public class TargetOffer_41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (sum < 1) return res;
        int n1 = 1, n2 = 2, tmp;
        ArrayList<Integer> list;
        while (n1 < n2){
            tmp = (n1 + n2) * (n2 - n1 + 1) / 2;
            if (tmp == sum){
                list = new ArrayList<>();
                for (int i = n1; i <= n2; i++) list.add(i);
                res.add(list);
                n2++;
            }else if (tmp < sum) n2++;
            else n1++;
        }
        return res;
    }
}
