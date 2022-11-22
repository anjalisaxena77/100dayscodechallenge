/* Question: 
A video player plays a game in which the character competes in a hurdle race. Hurdles are of varying heights, and the characters have a maximum height they can jump. 
There is a magic potion they can take that will increase their maximum jump height by 1 unit for each dose.
How many doses of the potion must the character take to be able to jump all of the hurdles. If the character can already clear all of the hurdles, return 0 .

Function Description

Complete the hurdleRace function in the editor below.

hurdleRace has the following parameter(s):

int k: the height the character can jump naturally
int height[n]: the heights of each hurdle

Sample Input 0

5 4
1 6 3 5 2
Sample Output 0

2



*/ 
Solution:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int max = 0;
        for(int i=0; i < n; i++){
            max = Math.max(max,in.nextInt());
        }
        if(k-max < 0)
            System.out.println(Math.abs(k-max));
        else
        System.out.println(0);
    }
}

