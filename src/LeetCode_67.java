public class LeetCode_67 {
    public String addBinary(String a, String b){
        int carry = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--){
            int sum = carry;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            builder.append(sum % 2);
            carry = sum / 2;
        }
        builder.append(carry == 1 ? carry : "");
        return builder.reverse().toString();
    }
}
