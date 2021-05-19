package blinov.chapter1.var2;

// Вывести на консоль четные и нечетные числа
public class Task1 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);

        /*
        * Лучше вывести пустую строку другим способом. В следующей строке начать с \n
        * для удаления лишних строк кода
        * */
//        System.out.println();

        System.out.println("\nЧетные числа: ");
        for (int a : area) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }

//        System.out.println();
        /*
        * по стилю кода, я бы отделял пробелами текст вокруг : и справа и слева
        * */
        System.out.println("\nНечетные числа: ");
        for (int a : area) {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
        }
    }
}
