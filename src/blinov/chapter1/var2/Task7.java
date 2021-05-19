package blinov.chapter1.var2;

// Вывести на консоль наибольший общий делитель и наименьшее общее кратное
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Для этой задачи рекомендуется вводить 2-3 числа");

        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);

        int gcd = 1;                     // greatest common divisor - НОД
        int lcm = 1;                     // least common multiple - НОК
        int temp;
        int min = 2147483647;
        int max = 0;

        // Находим наименьшее число
        // НОД не может быть больше, чем min

        for (int a : area) {
            if (Math.abs(a) < min) {
                min = Math.abs(a);
            }
        }

        for (int i = 1; i <= min; i++) {
            temp = 0;
            for (int a : area) {
                if (a % i != 0) {
                    temp++;
                }
            }
            if (temp == 0) {
                gcd = i;
            }
        }

        System.out.println();
        System.out.println("НОД = " + gcd);

        // Находим наибольшее число
        // НОК не может быть меньше, чем max

        for (int a : area) {
            if (Math.abs(a) > max) {
                max = Math.abs(a);
            }
        }

        do {
            temp = 0;
            for (int a : area) {
                if (a == 0) {
                    System.out.println("Вы ввели 0. Решение не корректно");
                    break;
                }
                if (max % a != 0) {
                    temp++;
                }
            }
            if (temp == 0) {
                lcm = max;
            } else {
                max++;
            }
        } while (temp != 0);

        System.out.println();
        System.out.println("НОК = " + lcm);
    }
}
