 /*Question: 
 Input Format

Each line of the input contains two integers,  and . The locked stub code in the editor reads the input and sends the values to the method as parameters.

Constraints

Output Format

Each line of the output contains the result , if both  and  are positive. If either  or  is negative, the output contains "n and p should be non-negative". If both  and  are zero, the output contains "n and p should not be zero.". This is printed by the locked stub code in the editor.

Sample Input 0

3 5
2 4
0 0
-1 -2
-1 3
Sample Output 0

243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.
Explanation 0

In the first two cases, both n and p are postive. So, the power function returns the answer correctly.
In the third case, both  and  are zero. So, the exception, "n and p should not be zero.", is printed.
In the last two cases, at least one out of n and p is negative. So, the exception, "n or p should not be negative.", is printed for these two cases.
 
 
 
 */ 
Solution:
public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            try {
                System.out.println(MyCalculator.power(scanner.nextInt(), scanner.nextInt()));
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyCalculator {
    
    public static long power(int n, int p) throws Exception {
        
        long result = 1;
        
        if (n == 0 & p == 0) { 
            throw new Exception("n and p should not be zero.");
        } else if (n < 0 | p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        
        while (p > 0) {
            result = result * n;
            p--;
        }
        
        return result;
        
    }
            
}
