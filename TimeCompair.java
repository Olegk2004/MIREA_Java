import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите время в милисекундах:");
        long userTime = in.nextLong();
        Date userDate = new Date(userTime);
        System.out.println("Дата введенная пользователем: " + userDate);
        Date nowDate = new Date(System.currentTimeMillis());
        System.out.println("Текущая дата: " + nowDate);
        if(userDate.compareTo(nowDate) > 0){
            System.out.println("Дата пользователя позже текущей даты");
        }else{
            System.out.println("Дата пользователя раньше текушей даты");
        }

    }
}
