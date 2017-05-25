// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 3

import java.util.Scanner;
public class PalindromNumber
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      
      int number, n1, n2, n3;
   
      System.out.print("Enter a three digit number(100 - 999):");
      number = s.nextInt();
   
      if(number < 100 || number > 999) {
         System.out.print("The number you entered is not valid.");
      } 
      else {
        //get each digit of the number and create the reverse of the entered number
         n1 = number;
         n2 = n1 % 10;
         n3 = n2;
         n1 = n1 / 10;
         n2 = n1 % 10;
         n3 = n3 * 10 + n2;
         n1 = n1 / 10;
         n2 = n1 % 10;
         n3 = n3 * 10 + n2;
      
         if(number == n3) {
            System.out.print(number + " is a palindrome.");
         } 
         else {
            System.out.print(number + " is not a palindrome.");
         }
      }
   }
}