/* Question:
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]
Sample Output

true
true
false
true


*/
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
        String ins = sc.next();

        List<Integer> myStack = new LinkedList<>();
        List<Character> Brackets = List.of('{', '[', '(', '}', ']', ')');

        int bracketIdx = -1;
        for (int i = 0; i < ins.length(); i++) {
            char currentChar = ins.charAt(i);
            bracketIdx = Brackets.indexOf(currentChar);

            if ((myStack.size() > 0) && (bracketIdx - myStack.get(0) == 3)) {
                myStack.remove(0);
            } else {
                myStack.add(0, bracketIdx);
            }
        }
        System.out.println(myStack.size() == 0);
    }

    
    }
}
