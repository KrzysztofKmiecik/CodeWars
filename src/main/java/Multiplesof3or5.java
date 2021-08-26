import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Multiplesof3or5 {


    public int solution(int number) {
        Set<Integer> myMultiples = new HashSet();

        for (int i = 0; i < number; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                myMultiples.add(i);
            }
        }

        int result = 0;

        for (int multi : myMultiples) {
            result += multi;
        }
        return result;
        //TODO: Code stuff here
    }

    public static void main(String[] args) {
        Multiplesof3or5 multiplesof3or5 = new Multiplesof3or5();
        int solution2 = multiplesof3or5.solution4(10);
        System.out.println(solution2);
    }

    public int solution2(int number) {
        Integer[] myMultiples = new Integer[number];
        int index = 0;
        for (int i = 0; i < number; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {

                myMultiples[index] = i;
                index++;
            }
        }

        int result = 0;

        for (int multi = 0; multi < myMultiples.length; multi++) {
            if (myMultiples[multi] != null) {
                result += myMultiples[multi];

            }
        }
        return result;
    }

    public int solution3 (int number ){
        return IntStream.range(0,number)
                .filter(n->(n%3==0||n%5==0))
                .sum();

    }

    public int solution4 (int number){
        int sum=0;
        for (int i=0;i<number;i++){
            if(i%3==0||i%5==0){
                sum+=i;
            }
        }
        return sum;
    }


}
