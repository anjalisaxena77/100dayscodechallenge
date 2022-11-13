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
