/* Question:
A jail has a number of prisoners and a number of treats to pass out to them. 
Their jailer decides the fairest way to divide the treats is to seat the prisoners around a circular table in sequentially numbered chairs. 
A chair number will be drawn from a hat. Beginning with the prisoner in that chair, 
one candy will be handed to each prisoner sequentially around the table until all have been distributed.

The jailer is playing a little joke, though. The last piece of candy looks like all the others, but it tastes awful. 
Determine the chair number occupied by the prisoner who will receive that candy.

Sample Input 0

2
5 2 1
5 2 2
Sample Output 0

2
3
  */
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            String lower = line.toLowerCase();
            lower = lower.replace(" ", "");
            
            Set<Character> chars = new HashSet<Character>();
            for (int i = 0; i < lower.length(); ++i) {
                chars.add(lower.charAt(i));
            }
            if (chars.size() != 26) {
                System.out.print("not ");
            }
            System.out.println("pangram");
        }
    }
}
