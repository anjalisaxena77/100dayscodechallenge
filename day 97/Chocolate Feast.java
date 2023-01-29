/* Question: 
Little Bobby loves chocolate. He frequently goes to his favorite 5 & 10 store, Penny Auntie, to buy them. They are having a promotion at Penny Auntie.
If Bobby saves enough wrappers, he can turn them in for a free chocolate.

Sample Input:-

STDIN   Function
-----   --------
3       t = 3 (test cases)
10 2 5  n = 10, c = 2, m = 5 (first test case)
12 4 4  n = 12, c = 4, m = 4 (second test case)
6 2 2   n = 6,  c = 2, m = 2 (third test case)

Sample Output:-

6
3
5 */
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        scanner.nextLine();
        while (scanner.hasNext()) {
            int money = scanner.nextInt();
            int price = scanner.nextInt();
            int bonus = scanner.nextInt();
            
            int count = money / price;
            int wrappers = count;
            
            while (wrappers >= bonus) {
                int freebies = wrappers / bonus;
                count += freebies;
                wrappers = freebies + wrappers % bonus;
            }
            
            System.out.println(count);
        }
    }
}
