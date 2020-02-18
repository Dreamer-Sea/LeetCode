package HuaWei;

import java.util.Scanner;

public class HuaWei_5 {

    private static String cs = "0123456789ABCDEF";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            int sum = 0;
            int count = 0;
            for (int i = s.length() - 1; i >= 2; i--){
                int idx = cs.indexOf(s.charAt(i));
                sum += idx * Math.pow(16, count++);
            }
            System.out.println(sum);
        }
    }
}
