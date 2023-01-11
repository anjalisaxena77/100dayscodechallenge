/* Question: 
Sorting is useful as the first step in many different tasks. The most common task is to make finding things easier, but there are other uses as well.
In this case, it will make it easier to determine which pair
or pairs of elements have the smallest absolute difference between them.

Sample Input 0

10
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 
Sample Output 0

-20 30

*/ 
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i< N-1; i++){
            min = Math.min(min, a[i+1] - a[i]);
        }
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < N-1; i++){
            if(a[i+1] - a[i] == min){
                sb.append(a[i] + " " + a[i+1] + " ");
            }
        }
        System.out.println(sb.toString());
     }
}

