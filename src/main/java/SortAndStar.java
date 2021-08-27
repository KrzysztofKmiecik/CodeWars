import java.util.*;
import java.util.stream.Collectors;

public class SortAndStar {
    public static void main(String[] args) {
        String s = SortAndStar.twoSort7(new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"});
        System.out.println(s); // a***r***e
    }


    public static String twoSort(String[] s) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        List<String> myList = new ArrayList<>(List.of(s));
        Collections.sort(myList);
        System.out.println(myList);
        int i=0;
        int size =myList.get(0).toCharArray().length;
        for (char character : myList.get(0).toCharArray()) {
            i++;
            stringBuilder.append(character);
            if (i<size){
                stringBuilder.append("***");
            }
        }
        result = stringBuilder.toString();
        return result;
    }

    public static String twoSort2(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }

    public static String twoSort3(String[] s) {
        return String.join("***", Arrays.stream(s).sorted().findFirst().orElse("").split(""));
    }


    public static String twoSort4(String[] s) {
        Arrays.sort(s);
        return s[0].replaceAll("([a-zA-Z])", "***$1").substring(3);
    }

    public static String twoSort5(String[] s) {
        Arrays.sort(s);
        return s[0].chars()
                .mapToObj(value -> String.valueOf((char) value))
                .collect(Collectors.joining("***"));
    }
    public static String twoSort6(String[] s) {
        return Arrays.stream(Arrays.stream(s).sorted().findFirst().get().split("")).reduce((p, c) -> p + "***" + c).get();
    }

    public static String twoSort7(String[] s) {
        String str = Arrays.stream(s).min(Comparator.naturalOrder()).get();
        return String.join("***",str.split(""));
    }

    public static String twoSort8(String[] s) {
        Arrays.sort(s);
        return Arrays.stream(s[0].split("")).collect(Collectors.joining("***"));
    }
}
