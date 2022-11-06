/* Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.
Question:
You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer n . In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers. In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.
Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!


*/
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();
            ArrayList<Integer> l=new ArrayList<>();
            for(int j=0;j<p;j++)
            {
                l.add(sc.nextInt());
            }
            list.add(l);
        }
        
        int query=sc.nextInt();
        for(int i=0;i<query;i++)
        {
            int q1=sc.nextInt();
            int q2=sc.nextInt();
            if(q1>n || q2>list.get(q1-1).size()){
                System.out.println("ERROR!");
            }else{
                System.out.println(list.get(q1-1).get(q2-1));
            }
                        
        }
    }
}
