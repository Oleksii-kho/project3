package blinov.chapter1.var2;

// Вывести на косоль все трехзначные числа,
// в десятичной записи которых нет одинаковых цифр
public class Task6 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);

        System.out.println();

        int digits [] = new int[3];                        // Массив для цифр трехзначного числа

        for (int i = 0; i < area.length; i++) {

            // область трехзначных чисел
            if ((area[i] <= -102 && area[i] >= -987) || (area[i] >= 102 && area[i] <= 987)) {
                int i1 = 0;
                int k = 1;
                while ((area[i] / k) != 0) {
                    digits [i1] = area[i] / k % 10;
                    k *= 10;
                    i1++;
                }

                if ((digits[0] == digits[1]) || (digits[0] == digits[2]) ||
                        (digits[1] == digits[2])) {
                    area[i] = 0;
                }
            } else {                                        // если не трехзначный или одиаковые цифры, то = 0
                area[i] = 0;
            }
        }

        System.out.println();
        System.out.println("Трехзначные числа без одинаковых цыфр: ");
        int temp = 0;
        for (int t : area) {
            if (t != 0) {
                System.out.print(t + " ");
                temp++;
            }
        }

        if (temp == 0) {
            System.out.println("Из введеных таких чисел нет");
        }
    }
}
