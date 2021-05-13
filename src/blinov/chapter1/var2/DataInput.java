package blinov.chapter1.var2;

import java.util.Scanner;

class DataInput {
    Scanner scan = new Scanner(System.in);

    String [] enterQuantityAndString () {
        System.out.println("Какое количество чисел вы хотите ввести?");
        String quantity = scan.next();
        int quantityInt = Integer.parseInt(quantity);
        String [] areaInput = new String [quantityInt];
        for (int i = 0; i < quantityInt; i++) {
            System.out.println("Введите " + (i + 1) + " -е число");
            areaInput [i] = scan.next();
        }

        System.out.println("Вы ввели такие числа: ");
        for (String a: areaInput) {
            System.out.print(a + " ");
        }
        return areaInput;
    }

    int [] doStringToInt (String [] str) {
        int [] areaInputNumbers = new int [str.length];
        for (int i = 0; i < str.length; i++) {
            areaInputNumbers [i] = Integer.parseInt(str[i]);
        }
        return areaInputNumbers;
    }


}
