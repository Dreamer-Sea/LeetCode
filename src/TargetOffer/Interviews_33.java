package TargetOffer;

public class Interviews_33 {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null || postorder.length == 0) return true;
        return verify(postorder, 0, postorder.length - 1);
    }

    private boolean verify(int[] postorder, int left, int right){
        if (left >= right) return true;
        int i = left;
        while (postorder[i] < postorder[right]) i++;
        int j = i;
        for (; j < right; j++){
            if (postorder[j] < postorder[right]) return false;
        }
        return verify(postorder, left, i-1) && verify(postorder, i+1, right-1);
    }
}
