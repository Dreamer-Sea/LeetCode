package TargetOffer;

public class Interviews_20 {
    public boolean isNumber(String s) {
        if (s.endsWith("f")||s.endsWith("D")) return false;
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
