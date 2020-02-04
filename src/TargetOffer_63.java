import java.util.LinkedList;

public class TargetOffer_63 {

    private LinkedList<Integer> list = new LinkedList<>();

    public void Insert(Integer num) {
        if (list.size() == 0 || num < list.getFirst()) list.addFirst(num);
        else{
            boolean flag = false;
            for (Integer e : list){
                if (num < e){
                    int idx = list.indexOf(e);
                    list.add(idx, num);
                    flag = true;
                    break;
                }
            }
            if (!flag) list.add(num);
        }
    }

    public Double GetMedian() {
        if (list.size() == 0) return null;
        if (list.size() % 2 == 0){
            int i = list.size() / 2;
            return Double.valueOf(list.get(i) + list.get(i-1)) / 2;
        }
        return Double.valueOf(list.get(list.size() / 2 ));
    }
}
