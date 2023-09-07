import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regular {
    public void Ex1(String input, String reg){
        Pattern regular = Pattern.compile(reg);
        String[] words = regular.split(input);
        for(String s: words){
            System.out.println(s);
        }
    }
    public boolean Ex2(String input){
        Pattern regular = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m = regular.matcher(input);
        return m.matches();
    }

    public boolean Ex5(String input){
        Pattern regular = Pattern.compile("[0-3][0-9]/[0-1][0-9]/[0-9][0-9][0-9][0-9]");
        Matcher m = regular.matcher(input);
        return m.matches();
    }
}
