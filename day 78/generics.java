/* Question: Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

You are given code in the editor. Complete the code so that it prints the following lines:

1
2
3
Hello
World */
Solution: 

import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
   static <T> void printArray(T[] arr) {
       for (T item : arr) {
           System.out.println(item); 
        }
    }
 
}

