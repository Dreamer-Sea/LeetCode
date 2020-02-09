public class TargetOffer_44 {

    public static void main(String[] args) {
        String s = "   ";
        String[] strs = s.split(" ");
        System.out.println();
    }

    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) return "";
        String[] strs = str.split(" ");
        if (strs.length == 0 || strs == null) return str;
        int i = 0, j = strs.length - 1;
        while (i < j){
            swap(strs, i++, j--);
        }
        StringBuilder builder = new StringBuilder();
        for (i = 0; i < strs.length; i++){
            builder.append(strs[i]);
            if (i != strs.length - 1) builder.append(" ");
        }
        return builder.toString();
    }

    private void swap (String[] strs, int i, int j){
        String t = strs[i];
        strs[i] = strs[j];
        strs[j] = t;
    }
}
