/*
 * Это программа с практическими заданиями
 * ко второй главе
 * из учебника Блинова
 */

package blinov.chapter2;

import temp.Car;
import temp.Lada;

import java.io.IOException;
import java.util.Scanner;

/**
 * Решение заданий
 * Учебник Блинова
 * Глава 2, вар. А
 *
 * @version 1.10 11 feb 2021
 * @author Khoriev
 */
public class VariantA {

    public static void main(String[] args) throws IOException {
        VariantA varA = new VariantA();
        varA.doTask1();
//        varA.doTask2();
//        varA.doTask3();

        Car car1 = new Car();
        car1.setColor("red");
        System.out.println(car1.getColor());


        Lada car2 = new Lada();
        car2.setColor("white");
        car2.setExistKey17(true);
        car2.drive();

    }

    /**
     * Задание 1
     * Нахождение min и max
     */
    void doTask1() {
        Scanner scan = new Scanner(System.in);
        int n;
        int maxOfField = 0;
        int minOfField = 2147483647;
        int minOfLght = 0;
        int maxOfLght = 0;

        System.out.println("Какое количество чисел вы хотите ввести?");

        n = scan.nextInt();                                                        // ввод количества чисел

        int field [] = new int [n];
        int lght [] = new int [n];

        for (int i = 0; i >= 0; i++) {                                             // заполнение массива
            if (i != n) {
                System.out.println("Введите " + (i + 1) + "-е число из " + n);
                field [i] = scan.nextInt();
            } else {
                break;
            }
        }

        System.out.println("Вы ввели такие числа:");

        for (int i : field) {                                                      // вывод масива на консоль
            System.out.print(i + " ");
        }

        for (int i : field) {                                                      // поиск максимального числа
            if (i >= maxOfField) {
                maxOfField = i;
            }
        }

        maxOfLght = (int)(Math.log10(maxOfField) +1);                              // длина максимального числа

        System.out.println();
        System.out.println("Максимальное число: " + maxOfField);
        System.out.println("Его длина: " + maxOfLght);

        for (int i : field) {                                                      // поиск минимального числа
            if (i <= minOfField) {
                minOfField = i;
            }
        }

        minOfLght = (int)(Math.log10(minOfField) +1);                              // длина минимального числа
        int minOfLengthMod = Math.abs(minOfField);
        minOfLengthMod = (int)(Math.log10(minOfLengthMod) +1);


        System.out.println();
        System.out.println("Минимальное число: " + minOfField);
        System.out.println("Его длина: " + minOfLght);
        System.out.println("Его длина по модулю: " + minOfLengthMod);

    }

    /**
     * Задание 2
     * Упорядочить по возростанию (убыванию) длины
     */
    void doTask2() {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("Какое количество чисел вы хотите ввести?");

        while (true) {
            n = scan.nextInt();                                                        // ввод количества чисел
            if (n < 1) {
                System.out.println("Вы ввели некоректное число. Введите число больше 0");
                continue;
            }
            break;
        }

        int field [] = new int [n];
        int lght [] = new int [n];

//        int index =0;
//        while (true) {
//            System.out.println("Введите " + (index + 1) + "-е число из " + n);
//            field [index++] = scan.nextInt();
//            if (index >= n) {
//                break;
//            }
//        }


        for (int i = 0; i < n; i++) {                                             // заполнение массива
            System.out.println("Введите " + (i + 1) + "-е число из " + n);
            field [i] = scan.nextInt();
//            if (i != n) {
//                System.out.println("Введите " + (i + 1) + "-е число из " + n);
//                field [i] = scan.nextInt();
//            } else {
//                break;
//            }
        }

        System.out.println("Вы ввели такие числа:");

        for (int i : field) {                                                      // вывод масива в консоль
            System.out.print(i + " ");
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int num1 = (int)(Math.log10(field[j]));

                // сравниваем два соседних значения
                if (num1 > (int)(Math.log10(field[j + 1]))) {
                    int tmp = field [j];
                    field [j] = field [j + 1];                                     // если да, то меняем местами
                    field [j + 1] = tmp;
                }
            }
        }

        System.out.println();
        System.out.println("Сортируем в порядке возрастание длины:");

        for (int i : field) {                                                      // вывод масива в консоль
            System.out.print(i + " ");
        }
    }

    /**
     * Задание 3
     * Упорядочить больше (меньше) средней длины
     */
    void doTask3() {
        Scanner scan = new Scanner(System.in);
        int n;
        int meanLght;
        int sumLght = 0;

        System.out.println("Какое количество чисел вы хотите ввести?");

        n = scan.nextInt();                                                        // ввод количества чисел

        int field [] = new int [n];
        int lght [] = new int [n];

        for (int i = 0; i >= 0; i++) {
            if (i != n) {
                System.out.println("Введите " + (i + 1) + "-е число из " + n);
                field [i] = scan.nextInt();                                        // заполнение массива чисел
                lght [i] = (int)(Math.log10(field[i]) + 1 );                       // заполнение массива длины
            } else {
                break;
            }
        }

        System.out.println("Вы ввели такие числа:");

        for (int i : field) {                                                      // вывод масива в консоль
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : lght) {                                                       // суммируем все длины
            sumLght += i;
        }

        System.out.println();
        meanLght = sumLght / n;                                                    // находим среднюю длину

        System.out.println("Средняя длина чисел: " + meanLght);

        System.out.println("Числа больше средней длины:");
        for (int i : field) {                                                      // вывод на консоль
            if ((int)(Math.log10(i) + 1 ) > meanLght) {
                System.out.println(i + " ");
            }
        }

        System.out.println("Числа меньше средней длины:");
        for (int i : field) {                                                      // вывод на консоль
            if ((int)(Math.log10(i) + 1 ) < meanLght) {
                System.out.println(i + " ");
            }
        }

        System.out.println("Числа средней длины:");
        for (int i : field) {                                                      // вывод на консоль
            if ((int)(Math.log10(i) + 1 ) == meanLght) {
                System.out.println(i + " ");
            }
        }
    }

}
