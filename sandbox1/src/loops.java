public class loops {
    public static void loops1() {

        int a = 0;
        while (a < 10) {
            a++;
            System.out.println(a);
        }
        System.out.println("done");

    }

    public static void loops3() {

        int a = 0;
        do {
            ++a;
            System.out.println(a);
        } while (a < 10);

        System.out.println("done");

    }

    public static void loops2() {

        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);

        }

        System.out.println("done");
    }
}
