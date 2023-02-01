/*Question:
Staircase detail

This is a staircase of size :4

   #
  ##
 ###
####
Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size n .

Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######


*/
Solution:
import java.io.*;
import java.util.*;

public class Solution {
    
    public static void drawStair(int size) {
        int level = size-1;
        for(int i = 0; i < size; i++) {
            StringBuilder s = new StringBuilder();
            for(int k = 0; k < level; k++) {
                s.append(" ");
            }
            for(int k = 0; k < size - level; k ++){
                s.append("#");
            }
            level -= 1;
            System.out.println(s.toString());
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        Solution sol = new Solution();
        
        int size = in.nextInt();
        sol.drawStair(size);
    }
