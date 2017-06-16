// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 7

import java.util.Scanner;
public class  PositiveNegative
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer, input ends if it is 0:");
      int n, countNeg = 0, countPos = 0;
      float sum = 0;
   
      while ((n = input.nextInt()) != 0) {
         sum = sum + n;
         if (n > 0) {
            countPos++;
         } 
         else if (n < 0) {
            countNeg++;
         }
      }
      if (countPos + countNeg == 0) {
         System.out.println("No numbers are entered except 0");
         System.exit(0);
      }
      System.out.println("Total positives numbers " + countPos);
      System.out.println("Total negatives numbers " + countNeg);
      System.out.println("The sum is " + sum);
      System.out.println("The average is " + (sum / (countPos + countNeg)));
   }
}