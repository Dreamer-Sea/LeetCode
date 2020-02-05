import java.util.Arrays;
import java.util.Comparator;

public class TargetOffer_32 {
    public String PrintMinNumber(int[] nums) {
        if (nums == null || nums.length == 0) return  "";
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        Arrays.sort(strs, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String a = o1 + o2;
                String b = o2 + o1;
                return a.compareTo(b);
            }
        });
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strs.length; i++)
            builder.append(strs[i]);
        return builder.toString();
    }
}
