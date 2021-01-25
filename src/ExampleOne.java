public class ExampleOne {
     public static void main (String args []) {
      int m = 4;
      String s = " ";
      switch (m) {
        case 12:
        case 1:
        case 2:
          s = "Зиме";
            break;
        case 3:
        case 4:
        case 5:
          s = "Весне";
            break;
        case 6:
        case 7:
        case 8:
          s = "Лету";
            break;
      }


       System.out.println(s);
    }
}
