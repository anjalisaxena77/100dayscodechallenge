/*Question 
HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any  less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5 .
If the value of grade is less than38 , no rounding occurs as the result will still be a failing grade.

Sample Input 0

4
73
67
38
33
Sample Output 0

75
67
40
33



*/
Solution:
import java.util.Scanner;
 

public class GradingStudents {
 
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int grade = in.nextInt();
            if (grade < 38) {
                arr[i] = grade;
            } else {
                int f1 = grade + 1;
                int f2 = grade + 2;
                if (f1 % 5 == 0) {
                    arr[i] = f1;
                } else if (f2 % 5 == 0) {
                    arr[i] = f2;
                } else {
                    arr[i] = grade;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
