import java.util.Scanner;

public class Test_2_B4 {
    public static void main(String args[]) {
        Scanner ii = new Scanner(System.in);
        int i;
        String month [] = {
                "Январь", "Февраль", "Март", "Апрель",
                "Май", "Июнь", "Июль", "Август",
                "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };

        System.out.println("Введите номер месяца");

        if (ii.hasNextInt()) {
            i = ii.nextInt();
            if (i >= 1 & i <= 12) {
                System.out.println("это месяц " + month[i-1]);
            } else {
                System.out.println("нет такого месяца. Введите число от 1 до 12");
            }
        } else {
            System.out.println("нужно было ввести число");
        }
    }

}
