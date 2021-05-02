package blinov.chapter1.var1;

import java.util.Scanner;

// Отобразить в окне консоли аргументы командной строки
// в обратном порядке

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String st2;

        System.out.println("Введите что-либо:");

        st2 = scan.next();
        char ch2 [] = st2.toCharArray();
        System.out.println("Вы ввели " + st2);
        System.out.println("А в обратном порядке будет: ");
        for (int i = st2.length() - 1; i >= 0; i --) {
            System.out.print(ch2[i]);
        }
    }
}
