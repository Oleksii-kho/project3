package blinov.chapter1.var2;

// Вывести в консоль период десятичной дроби p = m/n для первых двух целых положительных
//чисел n и m, расположенных подряд.
public class Task15 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);

        double p;
        int n = -1;                                                  // Первое положительное число
        int m = 0;                                                  // Второе положительное число
        int temp = 0;

        for (int a : area) {
            if (a > 0 && temp == 0) {
                n = a;
                temp++;
            } else if (a > 0 && temp == 1) {
                m = a;
                temp++;
            } else if (temp == 2) {
                break;
            }
        }

        p = (double) m / n;

        if (p > 0) {
            System.out.println();
            System.out.println("n = " + n + ", m = " + m);
            System.out.println("p = m / n = " + p);
        } else {
            System.out.println();
            System.out.println("Нет двух положительных чисел");
        }
    }
}
