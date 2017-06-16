// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        4

import java.util.*;
public class  HeadOrTail
{
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int randomNumber, guess;
   
      System.out.print("Enter a guess(0 or 1):");
      guess = s.nextInt();
   
      if(guess == 0 || guess == 1) {
         randomNumber = (int)(Math.random() * 2);
      
         if(guess == randomNumber) {
            System.out.print("You won.");
         } 
         else {
            System.out.print("You lose.");
         }
      } 
      else {
         System.out.print("The number you entered is not valid.");
      }
   }
}