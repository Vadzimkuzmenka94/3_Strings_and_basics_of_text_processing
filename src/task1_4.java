import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1_4 {

    public static int count =0;

    public static void main(String[] args) {

        String simples ="Да, пожалуй 12, одна 56  54  76 все сложно но все 98 будет хорошо. ";
        Pattern pattern = Pattern.compile("[1-9\\-]+[1-9]+");
        Matcher matcher = pattern.matcher(simples);
        while (matcher.find()){
            count++;
        }
        System.out.println("Количество чисел :" +count);
    }
}