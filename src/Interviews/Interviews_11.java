package Interviews;

public class Interviews_11 {
    public String compressString(String S) {
        if (S == null || S.length() == 0) return "";
        char c = S.charAt(0);
        int count = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < S.length(); i++){
            if (c == S.charAt(i)){
                count++;
            }else{
                builder.append(c);
                builder.append(count);
                c = S.charAt(i);
                count = 1;
            }
        }
        builder.append(c);
        builder.append(count);
        String res = builder.toString();
        return res.length() < S.length() ? res : S;
    }
}
