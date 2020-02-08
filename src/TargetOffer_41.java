import java.util.ArrayList;

public class TargetOffer_41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list;
        int low = 1, high = 2, tmp;
        while (low < high){
            tmp = (low + high) * (high - low + 1) / 2;
            if (tmp == sum){
                list = new ArrayList<>();
                for (int j = low; j <= high; j++){
                    list.add(j);
                }
                res.add(list);
                low++;
            }else if (tmp < sum) high++;
            else low++;
        }
        return res;
    }
}
