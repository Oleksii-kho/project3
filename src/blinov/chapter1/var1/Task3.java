package blinov.chapter1.var1;

import java.util.Scanner;

// Вывести заданное количество случайных чисел с переходом и без перехода
// на новую строку
public class Task3 {
    public static void main(String[] args) {
        int lowerRange;
        int upperRange;
        int number;
        int array1[];
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите нижнию границу чисел");
        lowerRange = scan.nextInt();

        System.out.println("Введите верхнюю границу чисел");
        upperRange = scan.nextInt();

        System.out.println("Введите количество случайных чисел");
        number = scan.nextInt();

        array1 = new int[number];

        for (int i = 0; i < number; i++) {
            array1[i] = (int) (Math.random() * (upperRange - lowerRange) + lowerRange);
        }

        System.out.println("Случайные числа без перехода на новую строку");
        for (int i = 0; i < number; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        System.out.println("Случайные числа с переходом на новую строку");
        for (int i = 0; i < number; i++) {
            System.out.println(array1[i]);
        }
    }
}
