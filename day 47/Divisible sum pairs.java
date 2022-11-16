/*Question:
Given an array of integers and a positive integer k, determine the number of(i,j)  pairs where i<j and ar[i]  + ar[j] is divisible by k .
Function Description

Complete the divisibleSumPairs function in the editor below.

divisibleSumPairs has the following parameter(s):

int n: the length of array ar
int ar[n]: an array of integers
int k: the integer divisor 

Sample Input

STDIN           Function
-----           --------
6 3             n = 6, k = 3
1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
Sample Output

 5



*/
Solution:
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result 
{
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    Scanner in = new Scanner(System.in);
         n = in.nextInt();
         k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
             a[a_i] = in.nextInt();
        }
        int cnt=0;
        for (int i = 0 ;i<n-1;i++) {
            for (int j=i+1;j<n;j++) {
                if ((a[i]+a[j]) % k == 0)
                    cnt ++;
            }
        }
        System.out.println(cnt);
    }
    }
    
