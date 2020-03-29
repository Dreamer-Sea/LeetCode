package TargetOffer;

import java.util.ArrayList;
import java.util.List;

public class Interviews_41 {



    class MedianFinder {

        private List<Integer> nums;

        /** initialize your data structure here. */
        public MedianFinder() {
            nums = new ArrayList<>();
        }

        public void addNum(int num) {
            if (nums.isEmpty() || num < nums.get(0)) nums.add(0, num);
            else{
                boolean flag = false;
                for (Integer e : nums) {
                    if (num < e){
                        int idx = nums.indexOf(e);
                        nums.add(idx, num);
                        flag = true;
                        break;
                    }
                }
                if (!flag) nums.add(num);
            }
        }

        public double findMedian() {
            int len = nums.size();
            if (len % 2 == 0){
                return Double.valueOf(nums.get(len/2-1) + nums.get(len/2)) / 2.0;
            }else{
                return Double.valueOf(nums.get(len / 2));
            }
        }
    }
}
