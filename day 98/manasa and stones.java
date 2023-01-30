/*
Question: 
Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. 
She starts following the trail and notices that any two consecutive stones' numbers differ by one of two values. 
Legend has it that there is a treasure trove at the end of the trail. If Manasa can guess the value of the last stone, the treasure will be hers.

Sample Input

STDIN   Function
-----   --------
2       T = 2 (test cases)
3       n = 3 (test case 1)
1       a = 1
2       b = 2
4       n = 4 (test case 2)
10      a = 10
100     b = 100
Sample Output

2 3 4 
30 120 210 300 

*/
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numberOfTestCases = scan.nextInt();
        for (int i = 0; i < numberOfTestCases; ++i) {
            int numberOfStones = scan.nextInt() - 1;
            int a = scan.nextInt();
            int b = scan.nextInt();
            
            if (numberOfStones <= 0) {
                System.out.println(0);
            }
            else {
                Vector<Integer> results = new Vector<Integer>();
                for (int j = 0; j <= numberOfStones; ++j) {
                    results.add((numberOfStones - j) * a + j * b);
                }

                Collections.sort(results);
                System.out.print(results.elementAt(0));
                for (int j = 1; j < results.size(); ++j) {
                    if (results.elementAt(j).equals(results.elementAt(j - 1))) { continue; }
                    else { System.out.print(" " + results.elementAt(j)); }
                }
                System.out.println();
            }
        }
    }
}
