package QuestionString;

public class Q5_String {

    /*
    Given a string, return a new string made of 3 copies
    of the last 2 chars of the original string. The string length will be at least 2.
    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
     */

    public static void main(String[] args) {

        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("Ayca"));
        System.out.println(extraEnd("Deniz"));
    //lololo
    //cacaca
    //iziziz
  }
    public static String extraEnd (String str){

        String lastTwoChar = str.substring(str.length()-2);
        return lastTwoChar + lastTwoChar +lastTwoChar;
    }

}
