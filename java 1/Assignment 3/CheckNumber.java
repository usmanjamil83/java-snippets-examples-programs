// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 3

import java.util.*;
public class CheckNumber

{
   static Scanner console=new Scanner(System.in);

   public static void main(String[] args)
   
   {
   
      int num;
      System.out.println("Please Enter a number");
      num=console.nextInt();
   
   
      if (num>0)
         System.out.println("The number you enter is positive");
      
      else 
      
      if (num<0)
         System.out.println("The number you enter is negative");
      
      else
         System.out.println("The number you enter is zero");
   
   }
}
