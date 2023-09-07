import  java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        int summ = 0;
        System.out.println(recursion(n, summ));
    }

    public static int recursion(int n, int summ) {
        if (n == 0) {
            return summ;
        }
        summ += n%10;
        return recursion(n/10, summ);
    }
}
