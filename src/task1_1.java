import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class task1_1 {
    public static void main(String[] args) {
        String[] strings = {"SomeString", "CamelCase", "SnakeCase"};
        Pattern p = Pattern.compile("\\B([A-Z])");
        for (int i = 0; i < strings.length; i++) {
            Matcher m = p.matcher(strings[i]);
            StringBuffer strb = new StringBuffer();
            while (m.find()) {
                m.appendReplacement(strb, "_$0");
            }
            m.appendTail(strb);
            strings[i] = strb.toString().toLowerCase();
        }
        System.out.println(Arrays.toString(strings));
    }
}