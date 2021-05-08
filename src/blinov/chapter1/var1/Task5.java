package blinov.chapter1.var1;

import java.util.Scanner;

// Ввести целые числа как аргументы командной строки,
// подсчитать их суммы (произведения) и вывести результат на консоль.
public class Task5 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введитет первое и второе число");
        x = scan.nextInt();
        y = scan.nextInt();

        System.out.println("Сумма чисел " + x + " и " + y + " равна: " + (x + y));
        System.out.println("Произведение чисел " + x + " и " + y + " равно: " + (x * y));
    }
}
