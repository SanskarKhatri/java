import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array2 = new int[5][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for (int[] i : array2) {
            System.out.println(Arrays.toString(i));
        }

        for (int i = 0; i < array2.length; i++ ) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                //System.out.print(array2[i][j] + " ");
                array2[i][j] = i*10 + j+1;
            }
        }

//        for (var i : array2) {
//            for (int j : i) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArr = new Object[3];
        System.out.println(Arrays.deepToString(anyArr));

        anyArr[0] = new String[] {"a","b","c"};
        System.out.println(Arrays.deepToString(anyArr));

        anyArr[1] = new String[][] {{"a","b","c"},{"a","l"},{"w"}};
        System.out.println(Arrays.deepToString(anyArr));

        anyArr[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArr));
    }
}