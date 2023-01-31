/* Question:
The distance between two array values is the number of indices between them.
Given a , find the minimum distance between any pair of equal elements in the array. If no such value exists, return -1.

Sample Input:-

STDIN           Function
-----           --------
6               arr[] size n = 6
7 1 3 4 1 7     arr = [7, 1, 3, 4, 1, 7]

Sample Output:-

3


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
        int a[] = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] == a[j]) {
                    int temp = j - i;
                    if (temp < min) {
                        min = temp;
                    }
                }
            }
        }
        if (min == Integer.MAX_VALUE)
            min = -1;
        System.out.println(min);
    }
}
