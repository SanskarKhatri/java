public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("73 inches = " + convertToCentimeters(73));
        System.out.println("6 feet 1 inch = " + convertToCentimeters(6,1));
    }

    public static double convertToCentimeters (int inches) {
        return 2.54*inches;
    }
    public static double convertToCentimeters (int feet, int inches) {
        return convertToCentimeters(feet*12 + inches);
    }
}
