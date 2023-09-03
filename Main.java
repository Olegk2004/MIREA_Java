import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива (одно целочисленное значение): ");
        int size = in.nextInt();
        int i = 0;
        int[] arr = new int[size];
        int summa = 0;
        int min = 999999999;
        int max = -999999999;
        while (i != size){
            System.out.println("Введите следующее значение(число): ");
            arr[i] = in.nextInt();
            summa += arr[i];
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
            i ++;
        }
        System.out.println("Минимальный элемент в массиве: "+min);
        System.out.println("Максимальный элемент в массиве: "+max);
        System.out.println("Сумма элементов в массиве: "+summa);
    }
}
