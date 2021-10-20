import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2_1 {
    public static void main(String[] args) {

        String text = "привет  всем кто сейчас      находится в этом        чате";
        int maxTab = 0;

        Matcher m = Pattern.compile("( )+").matcher(text);
        while (m.find()) {
            String sub = m.group();
            System.out.println(sub);
            if (sub.length() > maxTab) {
                maxTab = sub.length();
            }
        }
        System.out.println("maxLen: " + maxTab);
    }
}