package kunalpattern2;

public class Main {
    public static void main(String[] args) {
        int n;
        pattern4(n = 5);
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= (2 * n - 1); i++) {
            int totalColInRow = i > n ? 2 * n - i : i;
            {
                for (int j = 1; j <= totalColInRow; j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
    }
}