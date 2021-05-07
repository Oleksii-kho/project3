package blinov.chapter1.var2;

// Вывести на консоль отсортированные числа в порядке возрастания и убывания
public class Task9 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        int [] area = input.enterQuantityAndNumbers();

        int temp;
        int k;

        //убывание
        do {
            k = 0;
            for ( int i = 1; i < area.length; i++) {
                if (area[i] > area[i - 1]) {
                    temp = area[i];
                    area[i] = area [i - 1];
                    area [i - 1] = temp;
                    k++;
                }
            }
        } while (k != 0);

        System.out.println();
        System.out.println("Числа по убыванию: ");
        for (int a : area) {
            System.out.print(a + " ");
        }

        // возрастание
        do {
            k = 0;
            for ( int i = 1; i < area.length; i++) {
                if (area[i] < area[i - 1]) {
                    temp = area[i];
                    area[i] = area [i - 1];
                    area [i - 1] = temp;
                    k++;
                }
            }
        } while (k != 0);

        System.out.println();
        System.out.println("Числа по возрастанию: ");
        for (int a : area) {
            System.out.print(a + " ");
        }
    }
}
