/* Question:  
The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring. How tall will the tree be after  growth cycles?

Period  Height
0          1
1          2
2          3
3          6
4          7
5          14

Sample Input

3
0
1
4
Sample Output

1
2
7



*/
Solution:
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        final int 
            MONSOON = 100, 
            SUMMER = 200;
        Scanner input = new Scanner(System.in);
        int caseCount = Integer.parseInt(input.nextLine());
        for (int i = 0; i < caseCount; i++) {
            int treeHeight = 1;
            int cycleType = MONSOON;
            int cycleCount = Integer.parseInt(input.nextLine());
            for (int j = 0; j < cycleCount; j++) {
                switch (cycleType) {
                case MONSOON:
                    treeHeight = treeHeight * 2;
                    cycleType = SUMMER;
                    break;
                case SUMMER:
                    treeHeight += 1;
                     cycleType = MONSOON;
                    break;
                }
            }
            System.out.println(treeHeight);
        }
    }
}
