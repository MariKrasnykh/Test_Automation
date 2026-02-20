public class Task10 {
    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,1,1,0,0,1,0,1,1,1};
        for (int a: array) {
            if (a == 0) a = 1;
              else a = 0;
            System.out.print(a + " ");
        }
    }
}
