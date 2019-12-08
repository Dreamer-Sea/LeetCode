import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_56 {
    public int[][] merge(int[][] intervals){
        if (intervals.length <= 1) return intervals;

        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        List<int[]> res = new ArrayList<>();
        int ptr = 0;
        for (int i = 0; i < intervals.length; i++){
            if (i == start.length-1 || start[i+1] > end[i]){
                res.add(new int[]{start[ptr], end[i]});
                ptr = i + 1;
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}
