public class TargetOffer_52 {
    public boolean isNumeric(char[] str) {
        String s = String.valueOf(str);
        return s.matches("[-+]?[0-9]*(\\.[0-9]*)?([eE][-+]?[0-9]+)?");
    }
}