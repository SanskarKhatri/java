import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "Iam a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee","YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee[a-zA-Z0-9]*"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("ijkl99z$","THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]","I replaced a letter here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","X"));

        System.out.println("Harry".replaceAll("[Hh]arry","Harry"));
        System.out.println(alphanumeric.replaceAll("[^ej]","X"));
        System.out.println(alphanumeric.replaceAll("[abcdef345678]","X"));
        System.out.println(alphanumeric.replaceAll("[a-f3-8]","X"));
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]","X"));//ignores case
        System.out.println(alphanumeric.replaceAll("\\d","X"));
        System.out.println(alphanumeric.replaceAll("\\D","X"));

        String hasWhiteSpace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s",""));

        String phone = "(123) 456-7890";
        String USPhoneNumber =  "^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";
        Pattern USPhoneNumberPattern = Pattern.compile(USPhoneNumber);
        Matcher USPhoneNumberMatcher = USPhoneNumberPattern.matcher(phone);
        System.out.println(USPhoneNumberMatcher.matches());

    }
}