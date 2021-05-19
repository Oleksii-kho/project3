package blinov.chapter1.var2;

// Вывести на консоль числа Фибоначчи
public class Task12 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);

        int temp = 0;

        int [] numbFibonacci = new int [46];                        // при 47 будет уже переполнение int
        numbFibonacci [0] = 1;
        numbFibonacci [1] = 1;
        for (int i = 2; i < numbFibonacci.length; i++) {
            numbFibonacci [i] = numbFibonacci [i - 1] + numbFibonacci[i - 2];
        }

//        System.out.println();
//        System.out.println("числа Фибоначчи:");
//
//        for (int a : numbFibonacci) {
//            System.out.print(a + " ");
//        }

        System.out.println();
        System.out.println("Совпадения с числами Фибоначчи: ");

        for (int i = 1 ; i < numbFibonacci.length; i++) {
            for (int b : area) {
                if (numbFibonacci[i] == b) {
                    System.out.print(numbFibonacci[i] + " ");
                    temp++;
                }
            }
        }

        if (temp == 0) {
            System.out.println("не выявлено");
        }
    }
}
