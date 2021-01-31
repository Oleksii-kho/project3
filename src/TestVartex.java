import java.util.Scanner;

public class TestVartex {
    public static void main(String[] args) {

//      Задача 1
        {
            System.out.println("Задача 1: Необходимо вывести на экран числа от 1 до 5. ");
            System.out.println("На экране должно быть:");
            System.out.println("1 2 3 4 5");

            System.out.println();
            System.out.println("Решение:");

            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }

        }
        System.out.println();

//      Задача 2
        {
            System.out.println("\n Задача 2: Необходимо вывести на экран числа от 5 до 1. ");
            System.out.println("На экране должно быть:");
            System.out.println("5 4 3 2 1");

            System.out.println();
            System.out.println("Решение:");

            for (int i = 5; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

//      Задача 3
        {
            System.out.println("\n Задача 3: Необходимо вывести на экран таблицу умножения на 3");

            System.out.println();
            System.out.println("Решение:");

            int k = 3;
            int j;

            for (int i = 0; i <= 10; i++) {
                j = k * i;
                System.out.println(k + "*" + i + "=" + j);
            }
        }
        System.out.println();

//      Задача 4
        {
            System.out.println("\n Задача 4: ввести положительное число и вывести сумму");
            System.out.println("от 1 до этого числа");

            System.out.println();
            System.out.println("Решение:");

            Scanner kk = new Scanner(System.in);
            int j = 0;

            System.out.println("Введите целое положительное число");
            if (kk.hasNextInt()) {
                int k = kk.nextInt();
                if (k >= 1) {
                    for (int i = 1; i <= k; i++) {
                        j += i;
                        if (i != k) continue;
                        System.out.println("Сумма всех чисел от 1 до " + k + " равна " +j);
                    }
                } else {
                    System.out.println("Вы ввели не положительное число");
                }
            } else {
                System.out.println("Вы ввели не целое положительное число");
            }
        }
        System.out.println();
    }
}