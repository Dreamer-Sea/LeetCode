public class LeetCode_371 {

    public static void main(String[] args) {
        LeetCode_371 p = new LeetCode_371();
        System.out.println(p.getSum(20, 30));
    }

    public int getSum(int a, int b){
        while (b != 0){
            int tmp = a ^ b;
            b = (a & b) << 1;
            a = tmp;
        }
        return a;
    }
}
