/*Question:
Given the values of n and b for g  games of Happy Ladybugs, determine if it's possible to make all the ladybugs happy. For each game, return YES if all the ladybugs 
can be made happy through some number of moves. Otherwise, return NO.

Sample Input 0

4
7
RBY_YBR
6
X_Y__X
2
__
6
B_RRBR
Sample Output 0

YES
NO
YES
YES
*/
Solution:
import java.util.*;


public class Solution {

    private static boolean isHappyAlready(char c[]){
        int l=0,r=0;
        for(int i=0;i<c.length;i++){
            l=i-1;
            r=i+1;
            if(l>=0){
                if(c[l]==c[i]) continue;
            }
            if(r<c.length){
                if(c[r]==c[i]) continue;
            }
            return false;
        }
        return true;
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        String result="NO";
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            char[] b = in.next().toCharArray();
            
            char[] cs=new char[27];
            char c=0;
            for(int i=0;i<b.length;i++){
                c=b[i];
                if(c != '_')cs[c-'A']++;
                else cs[26]++;
            }
            result="YES";
            for(int i=0;i<26;i++){
                if(cs[i]==1) {result="NO";break;}
            }
            if(result=="YES"){
               
                if(cs[26]==0 && !isHappyAlready(b)){
                    result="NO";
                }
            }
            System.out.println(result);
        }
        
    }
}