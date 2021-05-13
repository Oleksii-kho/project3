package blinov.chapter1.var2;

// Вывести на консоль четные и нечетные числа
public class Task1 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);

        System.out.println();

        System.out.println("Четные числа: ");
        for (int a: area) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }

        System.out.println();

        System.out.println("Нечетные числа: ");
        for (int a: area) {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
        }
    }
}
