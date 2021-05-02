package blinov.chapter1.var1;

import java.util.Scanner;

// Ввести пароль из командной строки и сравнить его со строкой-образцом.
public class Task4 {
    public static void main(String[] args) {
       String model = "TruePin";
       String st;
       Scanner scan = new Scanner(System.in);

       System.out.println("Введите пароль:");

       st = scan.next();

       if (st.equals(model)) {
           System.out.println("Пароль введен верно!");
       } else {
           System.out.println("Пароль введен не правильно");
       }
    }
}
