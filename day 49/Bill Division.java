/* Question:  
Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they consume.
Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.

For example, assume the bill has the following prices:bill=[2,4,6] . Anna declines to eat item k=bill[2] which costs 6 . If Brian calculates the bill correctly, 
Anna will pay(2+4)/2=3 .
If he includes the cost of bill[2], he will calculate (2+4+6)/2=6 . In the second case, he should refund 3 to Anna.

Function Description:-

Complete the bonAppetit function in the editor below. It should print Bon Appetit if the bill is fairly split. Otherwise, it should print the integer amount of money that Brian owes Anna.

bonAppetit has the following parameter(s):

bill: an array of integers representing the cost of each item ordered
k: an integer representing the zero-based index of the item Anna doesn't eat
b: the amount of money that Anna contributed to the bill

Sample Input 0

4 1
3 10 2 9
12
Sample Output 0

5
*/ 
Solution:
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    

    public static void bonAppetit(List<Integer> bill, int k, int b) {
    int sum=0;
 for(int i=0;i<bill.size();i++)
 {
         if(i!=k)
            sum+=bill.get(i);
 }
 sum =sum/2;
 if(sum == b)
    System.out.println("Bon Appetit");
 else
    System.out.println(b-sum);
}

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        Result.bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
