/*Question:
You are given a square map as a matrix of integer strings. Each cell of the map has a value denoting its depth. 
We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth.
Two cells are adjacent if they have a common side, or edge.

Find all the cavities on the map and replace their depths with the uppercase character X.

Sample Input

STDIN   Function
-----   --------
4       grid[] size n = 4
1112    grid = ['1112', '1912', '1892', '1234']
1912
1892
1234
Sample Output

1112
1X12
18X2
1234

*/
Solution:
import java.util.*;
class Solution
    {
        public static void main(String ar[])
            {
                Scanner in=new Scanner(System.in);
                int n=in.nextInt(),i,j;
                char c[][]=new char[n][];
                for(i=0;i<n;i++)
                    {
                        c[i]=in.next().toCharArray();
                    }
                for(i=1;i<n-1;i++)                
                    {
                        for(j=1;j<n-1;j++)
                            {
                                if(c[i][j]>c[i][j-1] && c[i][j]>c[i][j+1] && c[i][j]>c[i-1][j] && c[i][j]>c[i+1][j])
                                    c[i][j]='X';
                            }
                    }
                for(i=0;i<n;i++)
                    System.out.println(new String(c[i]));
            }
    }
