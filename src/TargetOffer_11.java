public class TargetOffer_11 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(4));
    }

    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            count++;
            n &= (n-1);
        }
        return count;
    }
}
