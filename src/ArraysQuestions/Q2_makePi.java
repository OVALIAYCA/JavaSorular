package ArraysQuestions;

public class Q2_makePi {
    /*
    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    makePi() → [3, 1, 4]

     */
    public static void main(String[] args) {

        int [] result = makePi();
        for (int num:result)
              {
        System.out.print(num + " ");
        }

    }

    public static int[] makePi (){

        return new int[] {3,1,4};
    }
}
