//. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.
public class task1_5 {
    public static void main(String[] args) {
        String before = "даа      это конечно     очень хорошо и     очень интересно";
        String afther = before.replaceAll("( )+", " ");
        System.out.println(afther);
    }
}