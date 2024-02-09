public class Main {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15);   //preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15);   //deprecated since JDK 9
        int unboxedInt = boxedInt.intValue();
    }
    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

}