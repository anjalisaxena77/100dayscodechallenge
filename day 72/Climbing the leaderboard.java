/* Question:
An arcade game player wants to climb to the top of the leaderboard and track their ranking. 
The game uses Dense Ranking, so its leaderboard works like this:
The player with the highest score is ranked number  on the leaderboard.
Players who have equal scores receive the same ranking number,1 and the next player(s) receive the immediately following ranking number. 

*/
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

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    // Write your code here
 //create a List to store ranking results
        //we will return this at the end
    List<Integer> results= new ArrayList<Integer>();
        //create a TreeSet to remove duplicate values from List
    TreeSet<Integer> rankedTree = new TreeSet<Integer>(ranked);
        //create an array to store the values from the TreeSet
        //because I don't know how to use TreeSets :(
    Integer[] rankedArray = new Integer[rankedTree.size()];
    int index = 0;
    for (int x : rankedTree) {
        rankedArray[index] = x;
        index++;
    }
        //this remembers the last checked entry of the list
        //so we don't start from the beginning of the list
        //every single time
    int lastPosition = 0;
        //create a loop to check each entry in the player List
    for (int x : player) {
        //immediately return 1 if the number we're checking is
        //actually the #1 ranked score
        if (x >= rankedArray[rankedArray.length - 1]) {
            results.add(1);
        } else {
        //now check the player score against the scores in the
        //ranked List (starting from the last score we checked)
        //We are looking for a score that either beats our
        //score, or ties it.
        for (int i = lastPosition; i < rankedArray.length; i++) {
            //if a score on the list beats our score, 
            //then our rank is one below that score's rank.
            //Remember that score's position and stop checking scores.
            if (x < rankedArray[i]) {
                results.add(rankedArray.length + 1 - i);
                lastPosition = i;
                break;
            }
            //if a score on the list is tied with our score,
            //then our rank is the same as that score's rank.
            //Remember that score's position and stop checking scores.
            if (x == rankedArray[i]) {
                results.add(rankedArray.length - i);
                lastPosition = i == 0 ? 0 : i - 1;
                break;
            }
            }
        }
    }
    return results;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
