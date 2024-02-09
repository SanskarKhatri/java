public class Main {
    public static void main(String[] args) {
        int switchValue = 2;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Actually it was " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        String month = "JANUAR";
        System.out.println("Quarter for " + month + " is " + getQuarter(month));

        char alpha = 'X';
        System.out.println("The NATO word for " + alpha + " is " + natoWord(alpha));
    }
    public static String getQuarter (String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }

    public static String natoWord (char alpha) {
        switch (alpha) {
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "not found";
        }
    }

}