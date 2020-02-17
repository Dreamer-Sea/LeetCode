package HuaWei;

import java.util.Scanner;

public class HuaWei_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        char[] c = scanner.nextLine().toCharArray();
        int count = 0;
        char Lc = Character.toLowerCase(c[0]);
        for (int i = 0; i < s.length; i++){
            if (Lc == Character.toLowerCase(s[i])) count++;
        }
        System.out.println(count);
    }
}
