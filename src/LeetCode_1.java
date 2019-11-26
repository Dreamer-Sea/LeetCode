import java.util.HashMap;

public class LeetCode_1 {

    public static void main(String[] args) {
        LeetCode_1 p = new LeetCode_1();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        for (int n : p.twoSum(nums, target))
            System.out.print(n + " ");
    }

    public int[] twoSum(int[] nums, int target){
        if (nums == null || nums.length == 0) return new int[]{};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int tmp = target - nums[i];
            if (map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(tmp, i);
        }
        return null;
    }
}
