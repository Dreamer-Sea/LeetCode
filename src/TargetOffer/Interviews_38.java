package TargetOffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Interviews_38 {

    public static void main(String[] args) {
        Interviews_38 p = new Interviews_38();
        String[] ans = p.permutation("dkjphedy");
        for (String an : ans) {
            System.out.print(an + " ");
        }
    }

    private Set<String> res = new HashSet<>();

    public String[] permutation(String s) {
        if (s == null || s.length() == 0) return new String[0];
        backtracking(s.toCharArray(), 0);
        return res.toArray(new String[res.size()]);
    }

    private void backtracking(char[] cs,int idx){
        if (idx == cs.length){
            res.add(new String(cs));
            return;
        }
        for (int i = idx; i < cs.length; i++){
            swap(cs, i, idx);
            backtracking(cs, idx+1);
            swap(cs, i, idx);
        }
    }

    private void swap(char[] cs, int x, int y){
        char tmp = cs[x];
        cs[x] = cs[y];
        cs[y] = tmp;
    }
}
