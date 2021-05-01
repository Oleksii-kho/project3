package blinov.chapter1.var1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String st;

        System.out.println("Введите ваше имя и нажмите Enter: ");
        st = scan.next();
        System.out.println("Приветствую вас, " + st);
    }
}
