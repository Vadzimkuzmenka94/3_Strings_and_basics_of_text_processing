import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1_3 {
    public static void main(String arg[]) {
        String str="Число 1 - является вторым после 0, оно является положительным, кроме того в данной строке имеются" +
                "числа 5,7,9";
        int i=0;

        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(str);
        while (((Matcher) matcher).find()){
            i++;
        }
        System.out.println("Количество цифр в строке - " +i);
    }
}