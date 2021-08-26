import java.nio.charset.StandardCharsets;

/**
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 */

public class ComplementaryDNA {

    public static void main(String[] args) {
        String result = ComplementaryDNA.makeComplement("TAACG");
        System.out.println(result);
    }

    public static String makeComplement(String dna) {
        String result = "AAAA";

        byte[] bytes = dna.getBytes(StandardCharsets.UTF_8);
        char c = result.charAt(0);

        for (int i = 0; i < bytes.length; i++) {
            switch (bytes[i]) {
                case 84:
                    bytes[i] = 65;
                    break;
                case 65:
                    bytes[i] = 84;
                    break;
                case 67:
                    bytes[i] = 71;
                    break;
                case 71:
                    bytes[i] = 67;
                    break;
            }
        }
        return new String(bytes);
        //Your code
    }

}
