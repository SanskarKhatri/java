import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        int[] myArr = readIntegers();
        System.out.println(Arrays.toString(myArr));
        System.out.println("Minimum = " + findMin(myArr));
        //System.out.println(Arrays.toString(myArr));
        reverse(myArr);
        System.out.println(Arrays.toString(myArr));
    }
    private static void printText(String[] textList) {
        for(String t : textList) {
            System.out.println(t);
        }
    }
    private static int[] readIntegers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the list of integers seperated with commas:");
        String userList = s.nextLine();
        String[] intList = userList.split(",");
        int[] res = new int[intList.length];
        for (int i = 0; i < intList.length; i++) {
            res[i] = Integer.parseInt(intList[i]);
        }
        return res;
    }
    private static int findMin(int[] intArr) {
        int[] newArr = Arrays.copyOf(intArr,intArr.length);
        Arrays.sort(newArr);
        return newArr[0];
    }
    private static void reverse(int[] intArr) {
        System.out.println(Arrays.toString(intArr));
        for (int i = 0; i < intArr.length/2; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[intArr.length - i - 1];
            intArr[intArr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(intArr));
    }
}