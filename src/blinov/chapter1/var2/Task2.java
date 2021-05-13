package blinov.chapter1.var2;

// Вывести на консоль наибольшее и наименьшее число
public class Task2 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);
        int min = 2147483647;
        int max = -2147483648;

        System.out.println();

        for (int a : area) {
            if (a <= min) {
                min = a;
            }
        }

        for (int a : area) {
            if (a >= max) {
                max = a;
            }
        }

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);

    }
}
