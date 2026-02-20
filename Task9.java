public class Task9 {

    public static boolean checkYear(int year){
        return (year % 4 == 0 & year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        if (checkYear(1987) == true ) System.out.println("Год - високосный");
              else System.out.println("Год - не високосный");
    }
}
