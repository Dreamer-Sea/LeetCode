package Tencent;

public class Tencent_16 {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) return "0";
        int[] res = new int[num1.length() + num2.length()];
        int a, b, tmp;
        for (int i = num1.length() - 1; i >= 0; i--){
            a = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--){
                b = num2.charAt(j) - '0';
                tmp = a * b + res[i + j + 1];
                res[i + j] += tmp / 10;
                res[i + j + 1] = tmp % 10;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < res.length; i++){
            if (i == 0 && res[i] == 0) continue;
            builder.append(res[i]);
        }
        return builder.toString();
    }
}
