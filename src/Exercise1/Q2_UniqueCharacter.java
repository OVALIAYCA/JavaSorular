package Exercise1;

public class Q2_UniqueCharacter {

    //Example 2: Type code to print unique characters in a String. Hello ==> Heo INTERVIEW QUESTION
    public static void main(String[] args) {

        String str = "I love English"; // Output is : Heo Jv

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                System.out.print(ch);
            }

        }

        /*The code you've provided is intended to print the unique characters
        from a given string. Unique characters are those which
        appear only once in the string.
        For each character:
        str.indexOf(ch) gives the index of the first occurrence of ch in the string.
        str.lastIndexOf(ch) gives the index of the last occurrence of ch in the string.
        If both the indices are the same, it implies that the character appears only once in the string (i.e., it's unique).
        If the character is unique, it's printed to the console.*/
    }
}
