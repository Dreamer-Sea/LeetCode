import java.util.ArrayList;
import java.util.Collections;

public class TargetOffer_27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length() == 0) return res;
        backtracking(res, str.toCharArray(), 0);
        Collections.sort(res);
        return res;
    }

    private void backtracking(ArrayList<String> res, char[] cs, int idx){
        if (idx == cs.length-1){
            String s = String.valueOf(cs);
            if (!res.contains(s)) res.add(s);
        }else{
            for (int i = idx; i < cs.length; i++){
                swap(cs, i, idx);
                backtracking(res, cs, idx+1);
                swap(cs, i, idx);
            }
        }
    }

    private void swap(char[] cs, int i, int j){
        char tmp = cs[i];
        cs[i] = cs[j];
        cs[j] = tmp;
    }
}
