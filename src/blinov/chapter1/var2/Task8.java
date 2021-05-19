package blinov.chapter1.var2;

// Вывести на консоль простые числа
public class Task8 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);
        int temp = 0;

        for (int i = 0; i < area.length; i++) {
            if (area[i] < 2) {
                area[i] = 0;
            } else {
                for (int k = 2; k < area[i]; k++) {
                    if ((area[i] % k == 0) && (area[i] != 2)) {
                        area[i] = 0;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Простые числа: ");
        for (int a : area) {
            if (a != 0) {
                System.out.print(a + " ");
                temp++;
            }
        }

        if (temp == 0) {
            System.out.println("из введеных чисел простых нет");
        }
    }
}
