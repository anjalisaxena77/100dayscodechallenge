/* Question:
You are given a string containing characters A and B only. Your task is to change it into a string such that there are no matching adjacent characters. 
To do this, you are allowed to delete zero or more characters in the string.

Your task is to find the minimum number of required deletions.

Sample Input

5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB
Sample Output

3
4
0
0
4
*/
Solution:
import java.util.Scanner;
public class Solution {

    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-- > 0)
        {
            int count = 0;
            String str = s.nextLine();
            for(int i=1;i<str.length();i++)
            {
                if(str.charAt(i)==str.charAt(i-1))
                {
                    count++;
                }
            }
            System.out.println(count);	
        }
    }

}
