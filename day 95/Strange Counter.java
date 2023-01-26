/* Question: 
There is a strange counter. At the first second, it displays the number . Each second, the number displayed by decrements by  until it reaches .
In next second, the timer resets to  and continues counting down. 

Sample Input

4
Sample Output

6

*/
Solution:
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long curr = 3;
        while (t > curr) {
            t -= curr;
            curr *= 2;
        }
        System.out.println(curr-t+1);
    }
}
