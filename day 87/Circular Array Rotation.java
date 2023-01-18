/* Question: 
John Watson knows of an operation called a right circular rotation on an array of integers.
One rotation operation moves the last array element to the first position and shifts all remaining elements right one.
To test Sherlock's abilities, Watson provides Sherlock with an array of integers. 
Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.

For each array, perform a number of right circular rotations and return the values of the elements at the given indices.

Sample Input 0

3 2 3
1 2 3
0
1
2
Sample Output 0

2
3
1





*/
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        StringTokenizer array = new StringTokenizer(in.readLine());
        ArrayList<Integer> a = new ArrayList<Integer>(N);
        for (int i = 0; i < N; i++) {
            a.add(Integer.parseInt(array.nextToken()));
        }
         List<Integer> subListOne = a.subList(0, (N - (K % N)));
        a.addAll(subListOne);
        
        // Queries
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int x = Integer.parseInt(in.readLine());
            output.append(a.get(x + (N - (K % N)))).append("\n");
        }
        System.out.print(output.toString());
    }
}
