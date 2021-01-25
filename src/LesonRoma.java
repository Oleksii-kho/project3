import java.sql.SQLOutput;

public class LesonRoma {
    public static void main (String args []) {
	System.out.println("Hello git!!!");

//        doSelection();
        doCircles();
    }

    static void doSelection() {
        int a = 1;
        int a1 = 8;

        switch (a) {
            case 1:
            case 3:
                System.out.println("switch1 or switch3");
                break;
            case 2:
                System.out.println("switch2");
                break;
            default:
                System.out.println("def");
        }
    }

    static void doCircles() {
        int a = 0;
        int a1 = 2;

        if (a>0) {

        }

        while (a<10) {
            System.out.println(a);
            a++;
        }

        do {
            System.out.println(++a1);

        } while (a1<5);

        System.out.println("");

        int b [] = new int [3];
        System.out.println("length of the array: " + b.length);
        // заполнить массив данными
        for (int index=0; index<b.length; ) {
            // 1, 2, 3
            b[index]=++index;
        }

        // вывести все элементы массива с помощью конструкции forEach
//        for (int j: b) {
//            for (int k = 0; k >= 0; k++) {
//                System.out.println("k:" + k);
//                if (k == 2) {
//                    continue;
//                }
//            }
//            System.out.println(j);
//        }
//
//        blockOfCode: {
//            System.out.println("block of code");
//        }

        // бесконечный цикл
//        for (;;){
//
//        }

//        while (true) {
//            if (/*condition*/ a1 < 5) {
//                break;
//            }
//        }

        outer: for ( int i = 0 ; i < 10 ; i++ ) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println("");
                    continue outer;
                }
                System.out.println(" " + (i * j));
            }
        }
        System.out.println();
    }
}
