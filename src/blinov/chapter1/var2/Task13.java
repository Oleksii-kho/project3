package blinov.chapter1.var2;

// Вывести на консоль числа-палиндромы, значения которых в прямом и обратном порядке совпадают
public class Task13 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();

        int temp1;
        int temp2 = 0;
        int k;

        System.out.println();
        System.out.println("Числа-полиндромы:");

        for (String st : areaString) {
            temp1 = 0;
            k = st.length() / 2;
            char [] ch = st.toCharArray();
            for (int i = 0; i < k; i++) {
                if (ch [i] == ch [ch.length - (1 + i)]) {
                    temp1++;
                }
            }
            if (k == temp1 && k != 0) {
                System.out.print(st + " ");
                temp2++;
            }
        }

        if (temp2 == 0) {
            System.out.println();
            System.out.println("не найдено");
        }
    }
}
