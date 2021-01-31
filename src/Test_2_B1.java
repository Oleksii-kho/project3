import java.util.Scanner;

public class Test_2_B1 {
    public static void main(String args[])
    throws java.io.IOException {
        Scanner nn = new Scanner(System.in);
        Scanner mm = new Scanner(System.in);
        Scanner kk = new Scanner(System.in);
        int n = 0;
        int m = 0;
        int k  = 0;
        int choice;

        System.out.println("Введите значение n:");

        if (nn.hasNextInt()) {
            n = nn.nextInt();
            System.out.println("n=" + n);
        } else {
            System.out.println("Что-то ты не то ввёл...");
        }

        System.out.println("Введите значение m:");

        if (mm.hasNextInt()) {
            m = mm.nextInt();
            System.out.println("m=" + m);
        } else {
            System.out.println("Что-то ты не то ввёл...");
        }

        System.out.println("Введите значение k:");

        if (kk.hasNextInt()) {
            k = kk.nextInt();
            System.out.println("k=" + k);
        } else {
            System.out.println("Что-то ты не то ввёл...");
        }

        System.out.println("Выберете один из вариантов интервала");
        System.out.println("для проверки пренодлежности к нему числа k:");
        System.out.println("1. - (n, m]");
        System.out.println("2. - [n, m)");
        System.out.println("3. - (n, m)");
        System.out.println("4. - [n, m]");

        choice = (int) System.in.read();

        switch (choice) {
            case '1':
                if ((k > n) & (k <= m)) {
                    System.out.println("k=" + k + " (" + n + ", " + m + "]");
                    System.out.println("k пренадлежит этому интервалу");
                } else {
                    System.out.println("k=" + k + " (" + n + ", " + m + "]");
                    System.out.println("k не пренадлежит этому интервалу");
                }
                break;
            case '2':
                if ((k >= n) & (k < m)) {
                    System.out.println("k=" + k + " [" + n + ", " + m + ")");
                    System.out.println("k пренадлежит этому интервалу");
                } else {
                    System.out.println("k=" + k + " [" + n + ", " + m + ")");
                    System.out.println("k не пренадлежит этому интервалу");
                }
                break;
            case '3':
                if ((k > n) & (k < m)) {
                    System.out.println("k=" + k + " (" + n + ", " + m + ")");
                    System.out.println("k пренадлежит этому интервалу");
                } else {
                    System.out.println("k=" + k + " (" + n + ", " + m + ")");
                    System.out.println("k не пренадлежит этому интервалу");
                }
                break;
            case '4':
                if ((k >= n) & (k <= m)) {
                    System.out.println("k=" + k + " [" + n + ", " + m + "]");
                    System.out.println("k пренадлежит этому интервалу");
                } else {
                    System.out.println("k=" + k + " [" + n + ", " + m + "]");
                    System.out.println("k не пренадлежит этому интервалу");
                }
                break;
            default:
                System.out.println("Такого варианта нет");
        }
    }
}
