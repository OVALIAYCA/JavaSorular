package Exercise1;

public class Q3_Reverse {

    //Example 3: Type code to reverse a String       IMPORTANT
    //           For Example: Tom ==> moT

    public static void main(String[] args) {

        String s = "Bu da geçer";  //This initializes a string `s` with the value "Hello".
        String rev = "";     //This initializes an empty string `rev` which will store the reversed version of `s`.

        // The for loop starts with `i` set to the last index of the string `s` (which is s.length()-1)
        // and decreases `i` by 1 each iteration until `i` reaches 0 (inclusive).

        for (int i = s.length()-1 ; i >= 0; i--) {

            // Inside the loop, the charAt(i) method gets the character from the string `s` at the current index `i`.
            // This character is then appended to the end of the `rev` string.

            rev = rev + s.charAt(i);
            
        }
        System.out.println(rev);
    }
}
