import java.util.ArrayList;
import java.util.List;

public class LeetCode_567 {

    public static void main(String[] args) {
        LeetCode_567 p = new LeetCode_567();
        System.out.println(p.checkInclusion("islander", "islander"));
    }

    public boolean checkInclusion(String s1, String s2){
        if (s1.length() > s2.length()) return false;
        int[] dict1 = new int[26], dict2 = new int[26];
        for (int i = 0; i < s1.length(); i++){
            dict1[s1.charAt(i) - 'a']++;
            dict2[s2.charAt(i) - 'a']++;
        }
        if (match(dict1, dict2)) return true;
        for (int i = 0, j = s1.length(); j < s2.length(); i++, j++){
            dict2[s2.charAt(i) - 'a']--;
            dict2[s2.charAt(j) - 'a']++;
            if (match(dict1, dict2)) return true;
        }
        return false;
    }

    private boolean match(int[] dict1, int[] dict2){
        for (int i = 0; i < dict1.length; i++){
            if (dict1[i] != dict2[i]) return false;
        }
        return true;
    }
}
