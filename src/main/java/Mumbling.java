import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 */

public class Mumbling {

    public static void main(String[] args) {
        String result = Mumbling.accum3("ZpglnRxqenU");
        System.out.println(result);
    }

    public static String accum(String s) {
        String result = "";

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j==0){
                result += String.valueOf(charArray[i]).toUpperCase();

                }else {

                result += String.valueOf(charArray[i]).toLowerCase();
                }
            }
            if (i<charArray.length-1)
                result += String.valueOf('-');

        }
        return result;
        // your code
    }

    public static String accum2(String s) {
        return IntStream.range(0,s.length())
                .mapToObj(i-> Stream.generate(()->s.charAt(i)).limit(i+1).collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString())
                .map(a->a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase())
                .collect(Collectors.joining("-"));
    }

    public static String accum3(String s) {
        s = s.toLowerCase();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            builder.append(Character.toUpperCase(ch));
            for (int j = 0; j < i; j++) {
                builder.append(ch);
            }
            builder.append("-");
        }

        return builder.deleteCharAt(builder.lastIndexOf("-")).toString();
    }
}
