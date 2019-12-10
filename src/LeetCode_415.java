public class LeetCode_415 {

    public static void main(String[] args) {
        LeetCode_415 p = new LeetCode_415();
        System.out.println(p.addStrings("1", "9"));
    }

    public String addStrings(String num1, String num2){
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        for (int i = num1.length()-1, j = num2.length()-1; i >= 0 || j >= 0; i--, j--){
            int sum = carry;
            sum += i >= 0 ? num1.charAt(i)-'0' : 0;
            sum += j >= 0 ? num2.charAt(j)-'0' : 0;
            builder.append(sum % 10);
            carry = sum / 10;
        }
        builder.append(carry != 0 ? carry : "");

        return builder.reverse().toString();
    }
}
