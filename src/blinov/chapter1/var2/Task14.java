package blinov.chapter1.var2;

// Вывести в консоль элементы, которые равны полусумме соседних элементов
public class Task14 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);

        int temp = 0;

        System.out.println();
        System.out.println("Числа, которые равны полусумме соседних чисел:");

        for (int i = 1; i < area.length - 1; i++) {
            if (area[i] == (area[i - 1] + area[i + 1])/2) {
                System.out.print(area[i] + " ");
                temp++;
            }
        }

        if (temp == 0) {
            System.out.print("не найдено");
        }
    }
}
