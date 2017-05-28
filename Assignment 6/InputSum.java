// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 6

import java.util.*;
import java.io.*;
public class InputSum
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int number;
      int sum=0;
      List<Integer> numbers = new ArrayList<Integer>();
      System.out.print("Enter an integer (-1 to quit): ");
      for(; ; )
      {
         number = scan.nextInt();
         if (number == -1)
         {
            break;
         }
         numbers.add(Integer.valueOf(number));
         sum += number;
      }
      System.out.print("Entered Number: " + numbers);
      System.out.print("\nThe Sum: " + sum);
   }
}