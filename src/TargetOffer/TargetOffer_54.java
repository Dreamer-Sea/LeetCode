package TargetOffer;

public class TargetOffer_54 {

    private int[] store = new int[128];
    private int idx = 1;

    public void Insert(char ch){
        if (store[ch] == 0) store[ch] = idx++;
        else store[ch] = -1;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce(){
        char c = '#';
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < store.length; i++){
            if (store[i] != 0 && store[i] != -1 && store[i] < min){
                min = store[i];
                c = (char) i;
            }
        }
        return c;
    }
}
