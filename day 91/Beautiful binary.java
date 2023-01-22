/*Question: 
Alice has a binary string. She thinks a binary string is beautiful if and only if it doesn't contain the substring"010" .

In one step, Alice can change a 0 to a 1  or vice versa. Count and print the minimum number of steps needed to make Alice see the string as beautiful.


Sample Input 0

STDIN       Function
-----       --------
7           length of string n = 7
0101010     b = '0101010'
Sample Output 0

2  


*/ 
Solution:
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        int answer = 0;
        int i = 0;
        while (i < n - 2){
            if (input.substring(i, i + 3).equals("010")){
                answer++;
                i += 3;
                continue;
            }
            i++;
        }
        System.out.println(answer);
    }
}
