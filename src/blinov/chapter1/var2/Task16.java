package blinov.chapter1.var2;

// Построить треугольник Паскаля для первого положительного числа
public class Task16 {
    public static void main(String[] args) {
        DataInput input = new DataInput();
        String [] areaString = input.enterQuantityAndString();
        int [] area = input.doStringToInt(areaString);

        int numberOfLines = 0;

        for (int a : area) {
            if (a > 1 && a < 15) {
                numberOfLines = a;
                break;
            }
        }

        if (numberOfLines != 0) {
            int lineLength = (numberOfLines * 2) - 1;

            int arr1 [] = new int [lineLength];
            int arr2 [] = new int [lineLength];


            System.out.println();
            System.out.println("Пирамида Паскаля для числа " + numberOfLines + ":");

            for (int j = 0; j < arr1.length; j++) {
                if (j == numberOfLines - 1) {
                    arr1[j] = 1;
                } else {
                    arr1[j] = 0;
                }
            }

            for (int a : arr1) {
                if (a == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(a);
                }
            }

            for (int i = 1; i < numberOfLines;) {
                for (int j = 0; j < arr1.length; j++) {
                    if (j == 0) {
                        arr2[j] = arr1[j + 1];
                    } else if (j == arr1.length - 1) {
                        arr2[j] = arr1[j - 1];
                    } else if (j != 0 && j != arr2.length - 1) {
                        arr2[j] = arr1[j - 1] + arr1[j + 1];
                    }
                }

                System.out.println();

                if (i < numberOfLines) {
                    for (int a : arr2) {
                        if (a == 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print(a);
                        }
                    }
                }
                i++;

                for (int j = 0; j < arr1.length; j++) {
                    if (j == 0) {
                        arr1[j] = arr2[j + 1];
                    } else if (j == arr2.length - 1) {
                        arr1[j] = arr2[j - 1];
                    } else if (j != 0 && j != arr2.length - 1) {
                        arr1[j] = arr2[j - 1] + arr2[j + 1];
                    }
                }

                System.out.println();
                if (i < numberOfLines) {
                    for (int a : arr1) {
                        if (a == 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print(a);
                        }
                    }
                }
                i++;
            }
        } else {
            System.out.println();
            System.out.println("В следующий раз введите число от 2 до 15");
        }
    }
}
