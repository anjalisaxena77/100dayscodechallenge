/*Question:
Consider an array of numeric strings where each string is a positive number with anywhere from 1 to 10^6 digits. 
Sort the array's elements in non-decreasing, or ascending order of their integer values and return the sorted array.
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
     * Complete the 'bigSorting' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY unsorted as parameter.
     */

    public static List<String> bigSorting(List<String> unsorted) {
    // Write your code here
    Collections.sort(unsorted, new Comparator<String>(){
            public int compare(String a, String b){
                if(a.length() > b.length()){
                    return 1;
                }
                else if(a.length() < b.length()){
                    return -1;
                }
                else {
                    BigInteger b1 = new BigInteger(a);
                    BigInteger b2 = new BigInteger(b);
                    return b1.compareTo(b2);
                }
            }
        }
        );
        return unsorted;
    }
       
    }


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> unsorted = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String unsortedItem = bufferedReader.readLine();
            unsorted.add(unsortedItem);
        }

        List<String> result = Result.bigSorting(unsorted);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
