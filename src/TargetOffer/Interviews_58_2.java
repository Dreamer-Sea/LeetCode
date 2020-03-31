package TargetOffer;

public class Interviews_58_2 {

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 2));;
    }

    public static String reverseLeftWords(String s, int n) {
        if (s == null || s.length() == 0) return "";
        if (n % s.length() == 0) return s;
        return s.substring(n) + s.substring(0, n);
    }
}
