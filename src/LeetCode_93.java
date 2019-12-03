import java.util.ArrayList;
import java.util.List;

public class LeetCode_93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s == null || s.length() == 0) return res;
        backtracking(res, s, new StringBuilder(), 0, 0);
        return res;
    }

    private void backtracking(List<String> res, String ip, StringBuilder restored, int idx, int count){
        if (ip.length() - idx > 3 * (4 - count)) return;
        if (count == 4 && ip.length() == idx){
            res.add(restored.toString());
            return;
        }
        for (int i = 1; i < 4; i++){
            if (idx + i > ip.length()) return;
            String s = ip.substring(idx, idx+i);
            if ((s.startsWith("0") && s.length() > 1)
            || (Integer.parseInt(s) > 255)) return;
            int originLen = restored.length();
            restored.append(s);
            restored.append((count == 3) ? "" : ".");
            backtracking(res, ip, restored, idx+i, count+1);
            restored.setLength(originLen);
        }
    }
}
