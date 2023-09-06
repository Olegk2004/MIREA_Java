import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        int x = n;
        recursion(n, x);
    }

    public static int recursion(int n, int x) {
        if (n == 0) {
            return 0;
        }
        System.out.print(x - n + 1+" ");
        return recursion(n - 1, x);
    }
}
