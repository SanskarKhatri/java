public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        getDurationString(-75,130);
    }
    public static void getDurationString (int minutes, int seconds) {
        if (minutes >= 0 && (seconds < 60 && seconds >= 0)) {
            int hours = minutes / 60;
            int newMinutes = minutes % 60;
            System.out.println(hours + "h " + newMinutes + "m " + seconds + "s");
        } else {
            System.out.println("Invalid input.");
        }
    }
    public static void getDurationString (int seconds) {
        if (seconds >= 0) {
            getDurationString((seconds / 60), (seconds % 60));
        } else {
            System.out.println("Invalid input.");
        }
    }
}
