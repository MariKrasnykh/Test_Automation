public class Task1to8 {

    public static void printThreeWords() {
        System.out.println("Orange" );
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 23, b = -48;
        if (a + b >= 0) System.out.println("Сумма положительная");
          else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 55;
        if (value <= 0) System.out.println("Красный");
        if (value > 0 & value <= 100) System.out.println("Желтый");
        if (value > 100) System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 13, b = 98;
        if (a >= b) System.out.println("a >= b");
          else System.out.println("a < b");
    }

    public static boolean checkSumBetween10And20 (int a, int b) {
        return (a + b >= 10 & a + b <= 20);
    }

    public static void determineSign(int number) {
        if (number >= 0) System.out.println("Число положительное");
          else System.out.println("Число отрицательное");
    }

    public static boolean isNegative(int number) {
       return  number < 0;
    }

    public static void printStringN(String line, int n) {
        for (int i = 1; i <= n; i++)
            System.out.println(line);
    }

    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        /* if (checkSumBetween10And20(3,5) == true ) System.out.println("true");
             else System.out.println("false");   */
        //determineSign(-453);
        /*  if (isNegative(-6) == true ) System.out.println("true");
              else System.out.println("false");  */
        //printStringN("Hello", 3);

    }

}
