import java.text.DecimalFormat;
import java.util.Scanner;

public class week1day3 {
    public static void hello_others() {
        String[] a = {"Peti", "Kati", "Juli"};
        for (int i = 0; i < a.length; i++) {
            System.out.println("Hello " + a[i] + "!");
        }
    }

    public static void two_numbers() {
        // Print the result of 22 multiplied by 13
        float a = 22 / 13f;
        System.out.println(a);

        // Print the integer part of 22 divided by 13
        int b = 22 / 13;
        System.out.println(b);

        // Print the remainder of 22 divided by 13
        int c = 22 % 13;
        System.out.println(c);
    }

    public static void coding_hours() {
        int daily = 6;
        int daysInWeek = 5;
        int weeks = 17;

        System.out.println(daily * daysInWeek * weeks + " hours spent coding during the course");

        int weeklyHours = 52;
        float hoursInWeek = 168;
        float ratio = weeklyHours / hoursInWeek * 100.0f;
        int percentage = (int) ratio;
        System.out.println(ratio);
        System.out.println(percentage + "% of the semester is spent coding");
    }

    public static void swap() {
        int a = 123;
        int b = 526;

        int c = a;
        a = b;
        b = c;

        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }

    public static void bmi() {
        //BMI = kg/m*m
        double massInKg = 81.2;
        double heightInM = 1.78;

        double result = Math.pow(heightInM, 2);
        double bmi = massInKg / result;
        DecimalFormat format = new DecimalFormat("#.0");
        System.out.println("Your bmi is " + format.format(bmi));

    }

    public static void cuboid() {
        int heigth = 100;
        int width = 200;
        int depth = 50;

        int surfaceArea = (heigth * width * 2) + (heigth * depth * 2) + (width * depth * 2);
        int volume = heigth * width * depth;
        System.out.println("surface area is " + surfaceArea + " cm2");
        System.out.println("volume is " + volume + " cm3");
    }

    public static void remainingSeconds() {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsPast = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;
        int secondsRemaining = 86400 - secondsPast;

        System.out.println("seconds past: " + secondsPast);
        System.out.println("seconds remaining: " + secondsRemaining);
    }

    public static void helloUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name!");

        String username = scanner.nextLine();
        System.out.println("Hello " + username + "!");
    }

    public static void kmToMl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Miles to convert:");

        double distanceInMiles = scanner.nextDouble();
        System.out.println("In kilometers: " + distanceInMiles * 1.61);
    }

    public static void animalLegs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of chickens:");
        int chickens = scanner.nextInt();

        System.out.println("Number of pigs:");
        int pigs = scanner.nextInt();

        System.out.println("There are " + ((pigs * 4) + (chickens * 2)) + " legs on this farm!");
    }

    public static void sumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 3 numbers");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        System.out.println("Sum: " + (one + two + three) + ", Average: " + ((one+two+three)/3));
    }
}
