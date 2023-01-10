/*Question: 
There is a collection of rocks where each rock has various minerals embeded in it. 
Each type of mineral is designated by a lowercase letter in the range . 
There may be multiple occurrences of a mineral in a rock. A mineral is called a gemstone if it occurs at least once in each of the rocks in the collection.

Given a list of minerals embedded in each of the rocks, display the number of types of gemstones in the collection.

Sample Input

STDIN       Function
-----       --------
3           arr[] size n = 3
abcdde      arr = ['abcdde', 'baccd', 'eeabg']
baccd
eeabg
Sample Output

2
*/
Solution:
import java.util.Scanner;

public class Solution {

    
    public static void main(String[] args) {
        int N;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        String s;
        int[] count = new int[26];
        int[] temp;
        for (int i = 0; i < N; i++) {
            temp = new int[26];
            s = in.next();
            for (char c : s.toCharArray()) {
                temp[c - 97] += 1;
                if (temp[c - 97] == 1)
                    count[c - 97] += 1;
            }
            temp = null;
        }
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == N)
                sum += 1;
        }
        count = null;//garabage collector
        System.out.println(sum);
    }

}
