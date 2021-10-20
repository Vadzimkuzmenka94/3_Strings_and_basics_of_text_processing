import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3_2 {
    public static void main(String[] args) {
        String xml;

        xml  = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "        <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "    <body/>\n" +
                "    </note>\n" +
                "</notes>";

        System.out.println(xmlParser(xml));
    }

    private static String xmlParser(String xml) {

        Pattern openedTag = Pattern.compile("<\\w.+?>");
        Pattern closedTag = Pattern.compile("</\\w.+?>");
        Pattern content = Pattern.compile(">.+?<");
        Pattern emptyTag = Pattern.compile("<\\w.+?>");

        StringBuilder strBuilder = new StringBuilder();

        String[] lines = xml.split("\n");

        for (String line : lines) {

            Matcher mOpenTag = openedTag.matcher(line);
            Matcher mClosedTag = closedTag.matcher(line);
            Matcher mContent = content.matcher(line);
            Matcher mEmptyTag = emptyTag.matcher(line);

            if (mOpenTag.find()) {
                strBuilder.append(mOpenTag.group());
                strBuilder.append(" <-- opened Tag.\n");
            }

            if (mClosedTag.find()) {
                strBuilder.append(mClosedTag.group());
                strBuilder.append(" <-- closed Tag.\n");
            }

            if (mContent.find()) {
                strBuilder.append(mContent.group(), 1, (mContent.group().length() - 1));
                strBuilder.append(" <-- content.\n");
            }

            if (mEmptyTag.find()) {
                strBuilder.append(mEmptyTag.group());
                strBuilder.append(" <-- empty Tag.\n");
            }

        }

        return strBuilder.toString();
    }
}

