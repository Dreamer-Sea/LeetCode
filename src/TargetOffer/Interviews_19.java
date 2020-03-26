package TargetOffer;

public class Interviews_19 {
    public boolean isMatch(String s, String p) {
        if (s.length() == 0 && p.length() == 0) return true;
        return match(s.toCharArray(), 0, p.toCharArray(), 0);
    }

    private boolean match(char[] str, int s, char[] pattern, int p){
        if (s >= str.length && p >= pattern.length) return true;
        if (s < str.length && p >= pattern.length) return false;
        if (p + 1 < pattern.length && pattern[p+1] == '*'){
            if (s >= str.length && p < pattern.length) return match(str, s, pattern, p+2);
            if (str[s] == pattern[p] || pattern[p] == '.'){
                return match(str, s+1, pattern, p)
                        || match(str, s+1, pattern, p+2)
                        || match(str, s, pattern, p+2);
            }else return match(str, s, pattern, p+2);
        }
        if (s >= str.length) return false;
        if (str[s] == pattern[p] || pattern[p] == '.'){
            return match(str, s+1, pattern, p+1);
        }
        return false;
    }
}
