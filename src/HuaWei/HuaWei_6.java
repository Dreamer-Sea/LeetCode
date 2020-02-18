package HuaWei;

import java.util.Scanner;

public class HuaWei_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            long num = scanner.nextLong();
            int pum = 2;
            StringBuilder builder = new StringBuilder();
            while (num != 1){
                while (num % pum == 0){
                    num /= pum;
                    builder.append(pum + " ");
                }
                pum++;
            }
            System.out.println(builder.toString());
        }
    }
}
