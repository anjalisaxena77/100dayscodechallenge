 /* Question: 
Given a sequence of n integers, p(1),p(2)....p(n) where each element is distinct and satisfies 1<p(x)<n. For each x where 1 < x < n that x is  increments from 1 to n , 
find any integer y such that p(p(y)) ----- x and keep a history of the values of y in a return array.
  Sample Input 0

3
2 3 1
Sample Output 0

2
3
1  */
Solution:
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
    //create ArrayList to store the results
        ArrayList<Integer> result = new ArrayList<>();
            //find the values from 1 to p.size in the ArrayList p
            //get their index, but add 1 so it's actually the 
            //nth position in the list, not the index.
            
            //Then get the index of THAT value, but again 
            //add 1 to get it as the nth position, not the index
        for (int i = 1; i <= p.size(); i++) {
            result.add(p.indexOf(p.indexOf(i)+1)+1);
        }
        return result;
       
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.permutationEquation(p);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
