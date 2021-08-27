import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedWords {

    public static void main(String[] args) {
        String result = ReversedWords.reverseWords("I like eating");
        System.out.println(result);
    }

    public static String reverseWords(String str) {
        String[] strings = str.split("\\s+");
        swap(strings);
        return String.join(" ", strings);
    }

    private static void swap(String[] strings) {
        List<String> list = Arrays.asList(strings);
        Collections.reverse(list);
        list.toArray(strings);
       // list.toArray(new String[0]);
    }
}
