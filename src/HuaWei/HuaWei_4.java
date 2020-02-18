package HuaWei;

import java.util.Scanner;

public class HuaWei_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            StringBuilder builder = new StringBuilder();
            if (s.length() < 9){
                builder.append(s);
                while (builder.length() < 8) builder.append("0");
                System.out.println(builder.toString());
            }else{
                for (int i = 0; i < s.length(); i += 8){
                    if (i+7 < s.length()){
                        builder.append(s.substring(i, i+8));
                        System.out.println(builder.toString());
                        builder = new StringBuilder();
                    }else{
                        builder.append(s.substring(i));
                        while (builder.length() < 8) builder.append("0");
                        System.out.println(builder.toString());
                    }
                }
            }
        }
    }
}
