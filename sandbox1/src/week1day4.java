import java.util.Scanner;


public class week1day4 {
    public static void bigger() {
        System.out.println("Provide two numbers");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        if (first < second) {
            System.out.println(second + " is bigger");
        } else {
            System.out.println(first + " is bigger");
        }
    }

    public static void varMutation() {
        double a = 24;
        int out = 0;
        if (a % 2 == 0) {
            out++;
        }
        System.out.println(out);

        int b = 13;
        String out2 = "";
        if (9 < b && b < 21) {
            out2 = "Sweet";
        } else {
            out2 = "Sour";
        }
        System.out.println(out2);
    }

    public static void pyramid() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How big a pyramid you want?");
        int lines = scanner.nextInt();
        String stars = "*";
        String space = "";

        for (int i = (lines - 1); i > -1; i--) {
            for (int j = 0; j < i; j++) {
                space += " ";
            }
            if (i != lines - 1) {
                stars = stars + "**";
            }

            System.out.println(space + stars);
            space = "";
        }
    }

    public static void diamond() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How big a pyramid you want?");
        int lines = scanner.nextInt();

        if (lines % 2 == 0) {
            lines -= 1;
        }

        String stars = "*";
        String space = "";
        int half = (lines - 1) / 2;

        for (int i = (lines - 1); i > -1; i--) {
            if (i >= half) {
                for (int j = 0; j < (i - half); j++) {
                    space += " ";
                }
                if (i != lines - 1) {
                    stars = stars + "**";
                }
                System.out.println(space + stars);
                space = "";

            } else {
                stars = "*";
                for (int j = 0; j < i; j++) {
                    stars = stars + "**";
                }
                space += " ";
                System.out.println(space + stars);
                stars = "*";
            }
        }
    }
}
