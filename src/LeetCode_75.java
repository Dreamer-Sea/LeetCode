import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;

public class LeetCode_75 {

    public static void main(String[] args) {
        LeetCode_75 p = new LeetCode_75();
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        p.sortColors(nums);
        System.out.println();
    }

    public void sortColors(int[] nums){
        if (nums.length == 0) return;
        int notRed = 0, notBlue = nums.length - 1;
        while (notRed < nums.length && nums[notRed] == 0) notRed++;
        while (notBlue >= 0 && nums[notBlue] == 2) notBlue--;

        int i = notRed;
        while (i <= notBlue){
            if (nums[i] == 0){
                swap(nums, i ,notRed);
                i++;
                notRed++;
            }else if (nums[i] == 2){
                swap(nums, i, notBlue);
                notBlue--;
            }else i++;
        }
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
