public class LeetCode_67 {
    public static void main(String[] args) {
        LeetCode_67 p = new LeetCode_67();
        System.out.println(p.addBinary("11", "1"));;
    }

    public String addBinary(String a, String b){
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        for (int i = a.length()-1, j = b.length()-1; i >= 0 || j >= 0; i--, j--){
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
