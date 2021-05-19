package blinov.chapter1.var2;

import java.util.Scanner;

class DataInput {
    Scanner scan = new Scanner(System.in);

    /*
    * я бы назвал метод enterAmountOfNumbers
    * если ввести 10.2, то все сломается. Тогда нужно указать, что вводить только
    * целочисленные числа
    */
    int [] enterQuantityAndNumbers () {
        System.out.println("Какое количество чисел вы хотите ввести?");
        int quantity = scan.nextInt();
        int [] areaNumbers = new int [quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.println("Введите " + (i + 1) + " -е число");
            areaNumbers [i] = scan.nextInt();
        }

        System.out.println("Вы ввели такие числа: ");
        for (int a : areaNumbers) {
            System.out.print(a + " ");
        }
        return areaNumbers;
    }

    int getFirstNumber (int a) {
        int firstNumber = 0;
        if (a >= 1000000000) {
            firstNumber = a / 1000000000 % 10;
        }
        return firstNumber;

    }
}
