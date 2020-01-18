import com.sun.xml.internal.txw2.annotation.XmlNamespace;

public class TargetOffer_51 {
    public boolean match(char[] str, char[] pattern){
        if (str == null && pattern == null) return true;
        return matchCore(str, 0, pattern, 0);
    }

    private boolean matchCore(char[] str, int s, char[] pattern, int p){
        if (s >= str.length && p >= pattern.length) return true;
        if (s < str.length && p >= pattern.length) return false;
        if (p+1 < pattern.length && pattern[p+1] == '*'){
            if (s >= str.length && p < pattern.length) return matchCore(str, s, pattern, p+2);
            if (str[s] == pattern[p] || pattern[p] == '.'){
                return matchCore(str, s, pattern, p+2)
                        || matchCore(str, s+1, pattern, p+2)
                        || matchCore(str, s+1, pattern, p);
            }else return matchCore(str, s, pattern, p+2);
        }
        if (s >= str.length) return false;
        if (str[s] == pattern[p] || pattern[p] == '.'){
            return matchCore(str, s+1, pattern, p+1);
        }
        return false;
    }
}
