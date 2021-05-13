package blinov.chapter1.var2;

// Вывести на консоль элементы, расположенные методом пузырька по убыванию модулей
public class Task5 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);

        int temp;
        int k;
        do {
            k = 0;
            for ( int i = 1; i < area.length; i++) {
                if (Math.abs(area[i]) > Math.abs(area[i - 1])) {
                    temp = area[i];
                    area[i] = area [i - 1];
                    area [i - 1] = temp;
                    k++;
                }
            }
        } while (k != 0);

        System.out.println();
        System.out.println("Числа, по убыванию модулей");
        for (int a : area) {
            System.out.print(a + " ");
        }
    }
}
