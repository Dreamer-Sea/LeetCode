package TargetOffer;

public class TargetOffer_31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int before, curr, after, count = 0, i = 1;
        while ((n / i) != 0){
            before = n / i / 10;
            curr = n / i % 10;
            after = n - (n / i * i);
            if (curr == 0) count += before * i;
            else if (curr == 1) count += before * i + after + 1;
            else count += (before + 1) * i;
            i *= 10;
        }
        return count;
    }
}
