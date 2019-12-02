public class LeetCode_151 {

    public static void main(String[] args) {
        LeetCode_151 p = new LeetCode_151();
        System.out.println(p.reverseWords("a good   example"));
    }

    public String reverseWords(String s){
        if (s == null || s.length() == 0) return "";
        String[] strs = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--){
            String str = strs[i];
            while (str.contains(" ")) str = str.replaceAll(" ", "");
            if ("".equals(strs[i])) continue;
            sb.append(strs[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }

    private void swap(String[] strs, int x, int y){
        String tmp = strs[x];
        strs[x] = strs[y];
        strs[y] = tmp;
    }
}
