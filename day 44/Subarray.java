/* Question: 
A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, Array = [1,2,3] if , then the subarrays are [1],[2],[3],[1,2],[2,3] and [1,2,3]. Something like [1,3] would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer,n, denoting the length of array .
The second line contains  space-separated integers describing each respective element, ai, in array A .

Constraints
1< n < 100
-10^4 < a^i < 10^4


Output Format

Print the number of subarrays of A having negative sums.

Sample Input

5
1 -2 4 -5 1
Sample Output

9


*/ 
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
    
        int[] array = new int[num];
        for(int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            int currentCount = 0;
            for(int j = i; j < array.length; j++) {
                currentCount += array[j];
                if(currentCount < 0) count++;
            }
        }
        System.out.println(count);
    }
}
