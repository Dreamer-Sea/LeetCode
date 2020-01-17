public class TargetOffer_68 {

    public static void main(String[] args) {
        TargetOffer_68 p = new TargetOffer_68();
        p.print1ToMaxOfNDigits(3);
    }

    public void print1ToMaxOfNDigits(int n){
        if (n == 0) return;
        char[] nums = new char[n];
        backtracking(nums, 0);
    }

    private void backtracking(char[] nums, int digit){
        if (nums.length == digit){
            printNums(nums);
            return;
        }
        for (int i = 0; i < 10; i++){
            nums[digit] = (char) (i + '0');
            backtracking(nums, digit+1);
        }
    }

    private void printNums(char[] nums){
        int idx = 0;
        while (idx < nums.length && nums[idx] == '0')
            idx++;
        while (idx < nums.length)
            System.out.print(nums[idx++]);
        System.out.println();
    }
}
