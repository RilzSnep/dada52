import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = {1.57d, 7.654d, 9.986d};
        int[] array3 = {52, 52, 52};
        for (int i = 0; i <= array1.length - 1; i++) {
            if (i != array2.length - 1) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.println(array1[i]);
            }
        }
        for (int i = 0; i <= array2.length - 1; i++) {
            if (i != array2.length - 1) {
                System.out.print(array2[i] + ", ");
            } else {
                System.out.println(array2[i]);
            }
        }
        for (int i = 0; i <= array3.length - 1; i++) {
            if (i != array2.length - 1) {
                System.out.print(array3[i] + ", ");
            } else {
                System.out.println(array3[i]);
            }
        }
        System.out.println(" ");


        for (int i = array1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.println(array1[i]);
            }
        }
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array2[i] + ", ");
            } else {
                System.out.println(array2[i]);
            }
        }
        for (int i = array3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array3[i] + ", ");
            } else {
                System.out.println(array3[i]);
            }
        }
        System.out.println(" ");


        for (int i = 0; i <= array1.length - 1; i++) {
            if (array1[i] % 2 == 1) {
                array1[i] = array1[i] + 1;

            }
        }
        System.out.println(Arrays.toString(array1));


    }
}
