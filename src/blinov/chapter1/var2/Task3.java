package blinov.chapter1.var2;

// Вывести на консоль числа, которые делятся на 3 или на 9
public class Task3 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);
        int k = 0;

        System.out.println();

        System.out.println("числа, которые делятся на 3 или на 9: ");
        for (int a : area) {
            if ((a % 3 == 0) || (a % 9 == 0)) {
                System.out.print(a + " ");
                k++;
            }
        }

        if (k == 0) {
            System.out.println("из введеных чисел таких нет");
        }
    }
}
