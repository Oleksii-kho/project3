package blinov.chapter1.var2;

// Вывести на консоль числа в порядке убывания частоты встречаемости чисел
public class Task10 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);

        int temp;                                               // вспомогательные переменные
        int k1;                                                 // вспомогательные переменные
        int k2;                                                 // вспомогательные переменные
        int k3;                                                 // вспомогательные переменные


        /*
           Считаем сколько раз встречаются два соседних числа
           Если второе число встречается чаще, то поменять их местами
           Делаем, пока не перестанут меняться местами
         */
        do {
            k3 = 0;
            for (int i = 1; i < area.length; i++) {
                k1 = 0;
                k2 = 0;
                for (int j = 0; j < area.length; j++) {
                    if (area[i - 1] != area[j]) {
                        k1++;
                    }

                    if (area[i] != area[j]) {
                        k2++;
                    }
                }

                if ((k1 > k2) && area[i] != area[i - 1]) {
                    temp = area[i];
                    area[i] = area [i - 1];
                    area [i - 1] = temp;
                    k3++;
                }
            }
        } while (k3 != 0);

        System.out.println();

        System.out.println("числа в порядке убывания частоты встречаемости чисел:");

        for (int i = 1; i < area.length; ) {
            if (area[i - 1] == area[i]) {
                i++;
            } else {
                System.out.print(area[i - 1] + " ");
                i++;
            }
        }
        if (area[area.length - 2] != area[area.length - 1]) {
            System.out.print(area[area.length - 1]);
        }
    }
}
