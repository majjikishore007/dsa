public class Question9 {
    public static void print(int n) {
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j += 2) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(10);
    }
}