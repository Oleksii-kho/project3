import java.util.Scanner;

public class Test_2_B3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        double a = 0;                           //коэфициенты уравнения ax^2+bx+c=0
        double b = 0;
        double c = 0;
        double x1;
        double x2;

        System.out.println("Введите параметры квадратного уравнения ax^2+bx+c=0");

        System.out.println("Введите значение a:");

        if (scan.hasNextDouble()) {
            a = scan.nextDouble();
            System.out.println("a=" + a);
        } else {
            System.out.println("Что-то ты не то ввёл...");
        }

        System.out.println("Введите значение b:");

        if (scan.hasNextDouble()) {
            b = scan.nextDouble();
            System.out.println("b=" + b);
        } else {
            System.out.println("Что-то ты не то ввёл...");
        }

        System.out.println("Введите значение c:");

        if (scan.hasNextDouble()) {
            c = scan.nextDouble();
            System.out.println("c=" + c);
        } else {
            System.out.println("Что-то ты не то ввёл...");
        }

        System.out.println("Решение уравнения " + a + "x^2 " + "+ " + "(" + b + "x) "
                + "+ " + "(" + c + ") " + "= 0:");

        double d = b * b - 4 * a * c;

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("Два ответа: x1=" + x1 + "; x2=" + x2);
        } else if (d == 0) {
            x1 = (-b) / 2 * a;
            System.out.println("Один ответ: x=" + x1);
        } else {
            System.out.println("Нет решения");
        }
    }
}
