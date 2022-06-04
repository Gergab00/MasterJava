import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CodeChallenge {

    /*
    Given an input string, write a function that returns the Run Length Encoded string for the input string.
    For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3dex6”
    */
    public static String runLengthEncoding(String input) {
        // Your code goes here
        String r = "";
        for(int i = 0; i < input.length(); i++){
            int count = 1;
            while(i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)){
                count++;
                i++;
            }
            if(1 != count)r+= Integer.toString(count);
            r+= Character.toString(input.charAt(i));
            //r+= count + Character.toString(input.charAt(i));

        }
        System.out.println(r);
        return r;
    }

    public static void solutionRunLengthEncoding(){
        String A[] ={
                "aaaoojjjlllpp",
                "ddfggtyyujhh",
                "hhhhyyytffffrddde",
                "pppoooiiiuuuhhggggfd",
        };
        for(int i=0;i<A.length;++i){
            System.out.println("Solution for Run Length Encoding: " + A[i] + " => " + runLengthEncoding(A[i]));
        }
    }

    /*
    Find the smallest positive integer that does not occur in a given sequence that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

    Given A = [1, 2, 3], the function should return 4.

    Given A = [−1, −3], the function should return 1.
    */

    public static int smallestPositive(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return 1;
    }

    public static void solutionSmallestPositive(){
        int[][] A = {
                {1, 3, 4, 6, 1, 2},
                {6, 8, 5, 4, 3, 1, 2},
                {-1,-2,-3},
                {1,2,1,2,3},
                {1,2,3}
        };

        for(int i=0;i<A.length;++i){
            System.out.println("Solution to Smallest Positive: " + Arrays.toString(A[i]) + " => " + smallestPositive(A[i]));
        }
    }

    /*
    An array is called "switching" if the odd and even elements are equal.

    Example:

       [2,4,2,4] is a switching array because the members in even positions (indexes 0 and 2) and odd positions (indexes 1 and 3) are equal.

       If A = [3,7,3,7, 2, 1, 2], the switching sub-arrays are:

       == > [3,7,3,7] and [2,1,2]

       Therefore, the longest switching sub-array is [3,7,3,7] with length = 4.

       As another example if A = [1,5,6,0,1,0], the the only switching sub-array is [0,1,0].

       Another example: A= [7,-5,-5,-5,7,-1,7], the switching sub-arrays are [7,-1,7] and [-5,-5,-5].

       Question:

       Write a function that receives an array and find its longest switching sub-array.

       I would like to know how you solve this problem and which strategies you use to solve this with a good time complexity?
       */
    public static int switching(int[] A) {
        if (A.length == 1) return 1;
        int even = A[0], odd = A[1];
        int start = 0, max_len = 0;
        for (int i = 2; i < A.length; ++i) {
            if (i % 2 == 0 && A[i] != even || i % 2 == 1 && A[i] != odd) {
                max_len = Math.max(max_len, i - start);
                start = i - 1;
                if (i % 2 == 0) {
                    even = A[i];
                    odd = A[i - 1];
                } else {
                    even = A[i - 1];
                    odd = A[i];
                }
            }
        }

        return Math.max(max_len, A.length - start);
    }

    public static void solutionSwitching(){
        int[][] A = {
                {2,4,2,4},
                {3,7,3,7, 2, 1, 2},
                {1,5,6,0,1,0},
                {7,-5,-5,-5,7,-1,7},
                {7,-5,-5,-5,-5,-5,7,-1,7,-1,7,-1},
                {1,1,1,1,1,1,1,1,1,1,1,1}
        };
        for(int i=0;i<A.length;++i){
            System.out.println("Solution to Switching array: " + Arrays.toString(A[i]) + " => " + switching(A[i]));
        }
    }
}