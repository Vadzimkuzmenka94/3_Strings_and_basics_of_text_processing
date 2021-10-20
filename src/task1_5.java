public class task1_5 {
    public static void main(String[] args) {
        String before = "даа      это конечно     очень хорошо и     очень интересно";
        String afther = before.replaceAll("( )+", " ");
        System.out.println(afther);
    }
}