// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 7

import java.util.Scanner;
public class OccurrenceOfMaxNumbers
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Numbers, input ends if it is 0: ");
      int i;
      int max = 0;
      int count = 0;
      while ((i = input.nextInt()) != 0)
         if (i > max)
         {
            max = i;
            count = 1;
         }
         else if (i == max)
         {
            count++;
         }
      System.out.println("The largest number is " + max);
      System.out.println("The occurrence count of the largest number is " + count);  
   }   
}