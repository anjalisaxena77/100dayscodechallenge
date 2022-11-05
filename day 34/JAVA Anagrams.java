/* Question: 
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings a and b consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams


*/
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner input = new Scanner(System.in);
    String a = input.next();
    String b = input.next();
    String reverseA = "";
    for(int i = a.length()-1;i>=0;i--){
        reverseA+=a.charAt(i);
    }
    String reverseLowerCaseA = reverseA.toLowerCase();
    String lowerCaseA = a.toLowerCase();
    String lowerCaseB = b.toLowerCase();
    char tempA[] = lowerCaseA.toCharArray();
    char tempB[] = lowerCaseB.toCharArray();
    Arrays.sort(tempA);
    Arrays.sort(tempB);
    if(reverseLowerCaseA.equals(lowerCaseB) || lowerCaseA.equals(lowerCaseB) || Arrays.equals(tempA,tempB) ){
        System.out.println("Anagrams");
    }else{
        System.out.println("Not Anagrams");
    }


    }
}
