package String_and_basics_of_text_processing;

public class task2_5 {
    public static void main(String[] args) {
        StringBuilder str;
        str = new StringBuilder("Hey all, i'm Vadzim, my surname Kuzmenka");
        System.out.println(countA(str));
    }
    private static int countA (StringBuilder str) {
        int count;
        count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}