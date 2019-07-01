import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class week2day1 {
    public static void array1() {
        int[] myArray = {1, 2, 3, 8, 5, 6};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 8) {
                myArray[i] = 4;
            }
        }
        System.out.println(myArray[3]);
        System.out.println(Arrays.toString(myArray));
    }

    public static void array2() {
        int[] myArray = {0, 0, 0, 0};
        for (int i = 0; i < myArray.length; i++) {
            if (i > 0) {
                myArray[i - 1] = 0;
            }
            myArray[i] = 1;
            System.out.println(Arrays.toString(myArray));
        }
    }

    public static void array3() {
        String[] animal = {"koal", "pand", "zebr"};
        for (int i = 0; i < animal.length; i++) {
            animal[i] += "a";
        }
        System.out.println(Arrays.toString(animal));
    }

    public static void array4() {
        int[] myArray = {3, 4, 5, 6, 7, 8};
        List<Integer> reversed = new ArrayList();
        for (int i = 0; i < myArray.length; i++) {
            //add item to index 0 of new ArrayList
            reversed.add(0, myArray[i]);
        }
        //
        Integer[] toPrint = new Integer[reversed.size()];
        reversed.toArray(toPrint);
        System.out.println(Arrays.toString(toPrint));
    }

    public static void factorio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The integer of:");
        int n = scanner.nextInt();
        int f = n;
        int c = n;
        for (int i = 1; i < f; i++) {
            n *= (c - 1);
            c -= 1;
        }
        System.out.println("is: " + n);
    }
}

