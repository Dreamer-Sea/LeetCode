package ByteDance;

import java.util.Scanner;

/**
 *  只使用加减乘除等基本运算实现正整数的开方（二分）
 *  输入的数是整数，且保证开方后的数也是整数
 */

public class ByteDance_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int left = 0, right = n, mid, tmp;
            while (left <= right){
                mid = (left + right) >> 1;
                tmp = mid * mid;
                if (tmp == n) {
                    System.out.println(mid);
                    break;
                }
                else if (tmp < n) left = mid + 1;
                else right = mid - 1;
            }
        }
    }
}
