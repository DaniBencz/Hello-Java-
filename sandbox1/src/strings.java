
import java.util.Scanner;

public class strings {
    public static void strings1() {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite number?");
        int favourite = input.nextInt();
        System.out.println("Your favourite number is: " + favourite);
    }

    public static void strings2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a float-point number, like 12.35");
        double amount = input.nextDouble();
        int cents = (int) (amount * 100);
        int euros = cents / 100;
        cents = cents % 100;
        System.out.println("euros: " + euros);
        System.out.println("cents: " + cents);
    }

}
