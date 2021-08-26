import java.nio.charset.StandardCharsets;

import static java.lang.Character.*;

public class altERnaTIngcAsE_ALTerNAtiNGCaSe {

    public static void main(String[] args) {
        String hello_world = altERnaTIngcAsE_ALTerNAtiNGCaSe.toAlternativeString3("HELLO world");
        System.out.println(hello_world);

    }

    public static String toAlternativeString(String string) {
        byte[] byteArray = string.getBytes(StandardCharsets.UTF_8);

        for (int i = 0; i < byteArray.length; i++) {
            if ((byteArray[i] >= 65) && (byteArray[i] <= 90)) {
                byteArray[i] = (byte) (byteArray[i] + (byte) 32);
            }else if ((byteArray[i] >= 97) && (byteArray[i] <= 122)) {
                byteArray[i] = (byte) (byteArray[i] - (byte) 32);
            }
        }
        return new String(byteArray);
        // your code here!
    }

    public static String toAlternativeString2(String string) {
        String result = "";
        for (char c : string.toCharArray()) {
            if(isUpperCase(c)) {
                result += toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }

    public static String toAlternativeString3(String string) {
        return string.chars()
                .map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static String toAlternativeString4(String string) {
        return new String(string.chars().map(x -> Character.isAlphabetic(x) ? x % 32 + (x / 32 + 1) % 2 * 32 + 64 : x).toArray(), 0, string.length());
    }

}
