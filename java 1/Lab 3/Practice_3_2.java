// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        3

import java.util.*;
public class Practice_3_2
{
   public static void main (String[] args)
   {
      final int MAX = 100;
      int grade, category;
   
      Scanner scan = new Scanner (System.in); // scanner object
      Random generator = new Random(); // random number generator object
      grade = generator.nextInt(MAX) + 1;
    
      category = grade / 10;
      System.out.print ("That grade is ");
      switch (category)
      {
         case 10:
            System.out.println (grade);
            System.out.println ("The letter grade is A");
            break;
         case 9:
            System.out.println (grade);
            System.out.println ("The letter grade is A");
            break;
         case 8:
            System.out.println (grade);
            System.out.println ("The letter grade is B");
            break;
         case 7:
            System.out.println (grade);
            System.out.println ("The letter grade is C");
            break;
         case 6:
            System.out.println (grade);
            System.out.println ("The letter grade is D");
            break;
         default:
            System.out.println (grade);
            System.out.println ("Ths latter grade is F");
      
      }
   }
}