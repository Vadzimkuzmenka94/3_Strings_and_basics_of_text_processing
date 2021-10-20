package String_and_basics_of_text_processing;
// доработать
public class task2_2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Yes, ok, adv");
        int i = stringBuilder.indexOf("a");
        stringBuilder.insert(i, "b");
        System.out.println(stringBuilder);
    }
}
