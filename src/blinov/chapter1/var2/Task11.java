package blinov.chapter1.var2;

// Вывести на консоль счастливые числа
public class Task11 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();

        int temp = 0;

        System.out.println();
        System.out.println("Счастливые числа:");

        for (String st : areaString) {
            int sumFirstHalf = 0;
            int sumSecondHalf = 0;

            // если длина "строки" четная, то делаем
            if (st.length() % 2 == 0) {
                char [] ch = st.toCharArray();                              // переводим строку в массив символов

                // суммируем первую половину числа
                for (int i = 0; i < ch.length / 2; i++) {
                    sumFirstHalf += Character.getNumericValue(ch[i]);       // символы в int
                }

                // суммируем вторую половину числа
                for (int i = ((ch.length / 2) - 1) + 1; i < ch.length; i++) {
                    sumSecondHalf += Character.getNumericValue(ch[i]);
                }

                // сравниваем, если true, то выводим число на консоль
                if (sumFirstHalf == sumSecondHalf) {
                    System.out.print(st + " ");
                    temp++;
                }
            }
        }

        if (temp == 0) {
            System.out.println("Счастливых чисел не найдено");
        }
    }
}
