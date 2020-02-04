public class TargetOffer_54 {

    private int[] store = new int[128];
    private int idx = 1;

    public void Insert(char ch){
        if (store[ch] == 0) store[ch] = idx++;
        else store[ch] = -1;
    }
    public char FirstAppearingOnce(){
        int min = Integer.MAX_VALUE;
        char ch = '#';
        for (int i = 0; i < 128; i++){
            if (store[i] != -1 && store[i] != 0 && min > store[i]){
                min = store[i];
                ch = (char) i;
            }
        }
        return ch;
    }
}
