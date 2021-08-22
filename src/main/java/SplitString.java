public class SplitString {
    public static void main(String[] args) {

        String[] result=solution("HelloWorld");

        for (String s :result){
        System.out.println(s);
        }

    }

    public static String[] solution(String s) {
        char[] charArray = s.toCharArray();
        String[] resultString;
        if(charArray.length%2==0){
            resultString=new String[charArray.length/2];
        }else{
            resultString=new String[charArray.length/2+1];
        }
        String str="";
        int index=0;
        for(int i=0;i<charArray.length;i++){
            str+=charArray[i];
            if(((i-1)%2==0)||(i== charArray.length-1)){
              resultString[index]=str;
              if((i== charArray.length-1)&&(str.length()%2!=0)){
                    resultString[index]+="_";
                }
              index ++;
              str="";
            }

        }
       return resultString;//Write your code here
    }
}
