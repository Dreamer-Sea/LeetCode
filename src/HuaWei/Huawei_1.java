package HuaWei;

import java.util.Scanner;

public class Huawei_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strs = s.split(" ");
        System.out.println(strs[strs.length - 1].length());
    }
}
