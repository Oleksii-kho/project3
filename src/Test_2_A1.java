import java.util.Scanner;

public class Test_2_A1 {
    public static void main(String args[]) {
        Scanner ii = new Scanner(System.in);
        int i = 0;
        int d [];
        d = new int [10];

        if (ii.hasNextInt()) {
        for (int j=0; ii.hasNextInt(); j++) {
            i = ii.nextInt();
            d [j] = i;

            System.out.println(j);
        }

        }

//        while (ii.hasNextInt()) {
//            System.out.println("15");
//            break;
//        }


//        if (ii.hasNextInt()) {
//            System.out.println("1177");
//            do {
//                i = ii.nextInt();
//                System.out.println("Hello");
//            } while (ii.hasNextInt());
//        }
    }
}
