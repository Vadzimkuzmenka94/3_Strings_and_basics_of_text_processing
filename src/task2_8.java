public class task2_8 {
    public static void main(String[] args) {
        StringBuilder string;
        string = new StringBuilder("Hello World, i study Java web development");
        searchTheLongestWord(string);
    }
    private static void searchTheLongestWord(StringBuilder str) {
        String[] words;
        int maxLength;
        words = stringToStringsArray(str);
        maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < words.length; i++) {
            maxLength = Math.max(maxLength, words[i].length());
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == maxLength) {
                printTheLongestWord(words[i]);
            }
        }
    }

    private static String[] stringToStringsArray(StringBuilder str) {
        String[] wordsArr;
        int arrLength;
        int startPosition;

        startPosition = 0;
        arrLength = wordsCounting(str);
        wordsArr = new String[arrLength];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                wordsArr[startPosition] = str.substring(0, i +1).trim();
                startPosition++;
                str.deleteCharAt(i);
                str = new StringBuilder(str.substring(i));
                i = 0;
            }
        }
        return wordsArr;
    }


    private static int wordsCounting(StringBuilder str) {
        int count;
        count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                count++;
            }
        }
        return count + 1;
    }
    private static void printTheLongestWord(String str) {
        System.out.println(str);
    }
}