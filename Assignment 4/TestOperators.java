// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 4

import java.util.Scanner;
public class TestOperators
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int number;
   
      System.out.print("Enter a number:");
      number = s.nextInt();
   
      System.out.print("Is " + number + " divisible by 5 and 6?");
      if((number % 5 == 0) && (number % 6 == 0)) {
         System.out.println(" true");
      } 
      else {
         System.out.println(" false");
      }
   
      System.out.print("Is " + number + " divisible by 5 or 6?");
      if((number % 5 == 0) || (number % 6 == 0)) {
         System.out.println(" true");
      } 
      else {
         System.out.println(" false");
      }
   
      System.out.print("Is " + number + " divisible by 5 or 6, but not both?");
        // XOR operator for the third condition
      if((number % 5 == 0) ^ (number % 6 == 0)) {
         System.out.println(" true");
      } 
      else {
         System.out.println(" false");
      }
   }
}