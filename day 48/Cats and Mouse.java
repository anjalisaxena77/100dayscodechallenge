mport java.util.*;

/* Question:
Two cats and a mouse are at various positions on a line. You will be given their starting positions.
Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel at equal speed. 
If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.

You are given 'q' queries in the form of x,y ,z and  representing the respective positions for cats A and B, and for mouse C .
Complete the function  to return the appropriate answer to each query, which will be printed on a new line.

If cat  catches the mouse first, print Cat A.
If cat  catches the mouse first, print Cat B.
If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.

Sample Input 0

2
1 2 3
1 3 2
Sample Output 0

Cat B
Mouse C

*/
Solution:
public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
            int catA = (x >= z) ? x - z : z - x;
        int catB = (y >= z) ? y - z : z - y;
        
        return (catA > catB) ? "Cat B" : (catA < catB) ? "Cat A" : "Mouse C";

    }

 
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);

            int q=sc.nextInt();
        for (int qItr = 0; qItr < q; qItr++) {
            
            int x = sc.nextInt();

            int y = sc.nextInt();

            int z = sc.nextInt();

            String result = catAndMouse(x, y, z);
           System.out.println(result);
           
        }

       

        sc.close();
    }
}
