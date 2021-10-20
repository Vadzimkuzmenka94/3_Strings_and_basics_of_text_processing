public class task2_7 {
    public static void main(String[] args) {
        StringBuilder string;

        string = new StringBuilder("abc cde def sdsr fdfs eefef");

        System.out.println(deleteWhitespacesAndRepeat(string));
    }

    private static StringBuilder deleteWhitespacesAndRepeat(StringBuilder str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i) || Character.isWhitespace(str.charAt(j))) {
                    str.deleteCharAt(j);
                    j--;
                }
            }
        }

        return str;

    }
}