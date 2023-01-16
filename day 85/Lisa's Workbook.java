/* Question:
Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters. 
Lisa believes a problem to be special if its index (within a chapter) is the same as the page number where it's located. The format of Lisa's book is as follows:-

There are n chapters in Lisa's workbook, numbered from 1 to n .
The ith chapter has arr[i] problems, numbered from 1 to arr[i] .
Each page can hold up to k problems. Only a chapter's last page of exercises may contain fewer than k problems.
Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
The page number indexing starts at 1.

Sample Input

STDIN       Function
-----       --------
5 3         n = 5, k = 3
4 2 6 1 10  arr = [4, 2, 6, 1, 10]
Sample Output

4 */
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int max = in.nextInt();
        int[] arr = new int[num];
        int numPages = 0;
        int curPage = 1;
        int count = 0;
        for(int i =0;i<num;i++){
            arr[i] = in.nextInt();
            for(int prob= 1;prob<=arr[i];prob++){
                int whatPage = prob/max;    
                if(prob == curPage) {
                    count++;
                    //System.out.println("HI chap"+(i+1)+" prob "+prob);
                    }
                if(prob%max==0 && prob!=arr[i]){                    
                    curPage++;
                }               
            }      
            //System.out.println("END CHA"+curPage);
            curPage++;
        }
        System.out.println(count);
        //System.out.println(Arrays.toString(arr)+count);
    }
}
