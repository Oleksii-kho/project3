import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Test_2_B2 {
    public static void main(String args[]) {
        Scanner in1 = new Scanner(System.in);
        int size;                               //Размер матрицы
        int k = 0;
        int max = 20;                           //Макс. размер матрицы

        System.out.println("Введите размер квадратной матрицы: ");

        if (in1.hasNextInt()) {
            size = in1.nextInt();
            if (size >= 1 & size <=max) {
                for (int i = 0; i < size; i++) {
                    System.out.println();
                    for (int j = 0; j < size; j++) {
                        k++;
                        System.out.print(k + " ");
                    }
                }
            } else if (size > max) {
                System.out.println("Ну это слишком много...");
                System.out.println("Давай, чтоб не больше " + max);
            } else {
                System.out.println("Ты можешь представить матрицу такого размера? Серьёзно?");
            }
        } else {
            System.out.println("Что-то ты ввёл не то...");
            System.out.println("Введи целое число");
        }
    }

}
