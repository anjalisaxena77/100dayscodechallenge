/*Question:
One common task for computers is to sort data. For example, people might want to see all their files on a computer sorted by size. Since sorting is a simple problem with many different possible solutions, it is often used to introduce the study of algorithms.

Insertion Sort
These challenges will cover Insertion Sort, a simple and intuitive sorting algorithm. We will first start with a nearly sorted list.
*/
Solution:
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
   int v = arr.get(n-1); // take last number
            int i = n-2; // get last but one index
            while(i>=0 && v < arr.get(i)) {  // continue the loop till i>=0 and value < ith value
                if(arr.get(i) > v)
                    arr.set(i+1, arr.get(i)); // if value < ith value, shift ith value to i+1 th index
                i--; // go to left
                for(int x:arr) System.out.print(x +" "); // print the array in each setp
                System.out.println();
            }
            arr.set(i+1, v); // at ent set i+th value to value selected in the begining
            for(int x:arr) System.out.print(x +" "); // print the array again
            System.out.println();
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
