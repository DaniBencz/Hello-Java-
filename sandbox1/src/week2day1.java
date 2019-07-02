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
        //reverse order of items
        int[] myArray = {3, 4, 5, 6, 7, 8};
        //List<Integer> reversed = new ArrayList();
        int[] reversed = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            //add item to index 0 of new ArrayList
            //reversed.add(myArray[i]);
            reversed[i] = myArray[myArray.length - 1 - i];
        }
        //Integer[] toPrint = new Integer[reversed.size()];
        //reversed.toArray(toPrint);
        System.out.println(Arrays.toString(reversed));

        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println(numbers.get(i));
            }
        }
    }

    public static void array5() {
        int[] myArray = {3, 4, 5, 6, 7, 8};
        int[] copyLength = Arrays.copyOf(myArray, 5);
        int[] copyRange1 = Arrays.copyOfRange(myArray, 1, 3);
        int[] copyRange2 = new int[3];
        System.arraycopy(myArray, 1, copyRange2, 0, 3);
        //System.out.println(Arrays.toString(copyLength));
        //System.out.println(Arrays.toString(copyRange1));
        System.out.println(Arrays.toString(copyRange2));
    }

    public static void array6() {
        int[] fillIt1 = new int[10];
        Arrays.fill(fillIt1, 5);
        //System.out.println(Arrays.toString(fillIt1));

        int[] fillIt2 = new int[10];
        for (int i = 0; i < fillIt2.length; i++) {
            fillIt2[i] = (int) (Math.random() * 10);
        }
        int whereIs4 = Arrays.binarySearch(fillIt2, 4);

        System.out.println("place of '4' in original array: " + whereIs4);

        //Arrays.sort(fillIt2);
        System.out.println("sorted: " + Arrays.toString(fillIt2));
    }

    public static void factorio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The factorial of:");
        int n = scanner.nextInt();
        int f = n;
        for (int i = n; i > 1; i--) {
            f *= i;
        }
        System.out.println("is: " + f);
    }
}

