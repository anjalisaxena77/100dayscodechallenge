/*Question: You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. 
They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

Input Format

The first line contains a single integer,n , the size of candles .
The second line contains 'n' space-separated integers, where each integer 'i'  describes the height of candles[i].


Sample Input 0

4
3 2 1 3
Sample Output 0

2

*/
Solution:
import java.util.*;

class Solution{
    
      public  int birthdayCakeCandles(int arr[]) {
            int count=0;
            int max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]==max){
                    count++;
                }
            }
        
            return count;
        }
    }
            public class birthdaycakeproblem
            {
               public static void main(String args[]) {
                   Scanner sc=new Scanner(System.in);
                   Solution obj=new Solution();
                   int n;
                   //System.out.println("enter the number of elements");
                   n=sc.nextInt();
                   int arr[]=new int[n];
                   for(int i=0;i<n;i++){
                       arr[i]=sc.nextInt();
                   }
                   int a=obj.birthdayCakeCandles(arr);
                   //System.out.println("no of candles"+a);
                   System.out.println(a);
            }
 }
]
