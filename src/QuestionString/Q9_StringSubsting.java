package QuestionString;

public class Q9_StringSubsting {
    /*
    Given a string, return a version without the first and last char,
    so "Hello" yields "ell". The string length will be at least 2.

    withoutEnd("Hello") → "ell"
    withoutEnd("java") → "av"
    withoutEnd("coding") → "odin"
     */
    public static void main(String[] args) {

        System.out.println(withoutEnd("Hello"));
        //ell
    }
    public static String withoutEnd (String str){

        return str.substring(1,str.length()-1);
        //So, in the expression str.substring(1, str.length() - 1),
        //the substring starts from the second character and goes up to (but doesn't include) the last character.
    }
}
