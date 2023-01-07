/*Question: Write  a Program to segrregate all the 0's in left side and 1's on right side the same array with 0(n) complexity. */
Solution: 
import java.util.*;
public class segregate {
    public static void main(String args[]) {
        //Scanner sc=new Scanner(System.in);
       int n=5;
        int arr[]={0,1,0,1,0};
        int left=0,right=n-1;
       
         while(true){
            if(left>=right){
                break;
            }
        {
            if(arr[left]==0){
                left++;
            }
            else if(arr[right]==1){
                right--;
            }
            else{
                arr[left]=0;
                arr[right]=1;
                left++;
                right--;
            }
         }
         
    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
     }
}
}
