// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        3

import java.util.Scanner;
public class Practice_3_1
{
   public static void main (String[] args)
   {
      int grade1, grade2, grade3, grade4, high, highest, low, lowest;
      double average;
   
      Scanner scan = new Scanner (System.in);
   
      System.out.println ("Enter four grades: ");
      grade1 = scan.nextInt();      
      grade2 = scan.nextInt();      
      grade3 = scan.nextInt();      
      grade4 = scan.nextInt();
      System.out.println (grade1);
      System.out.println (grade2);
      System.out.println (grade3);
      System.out.println (grade4);
      
      if (grade1 > grade2)
         if (grade1 > grade3)
            high = grade1;
         else
            high = grade3;
      else
         if (grade2 > grade3)
            high = grade2;
         else
            high = grade3;
      if (high > grade4)
         highest = high;
      else 
         highest = grade4;
        
      System.out.println ("Highest Grade: " + highest);
      
      if (grade1 < grade2)
         if (grade1 < grade3)
            low = grade1;
         else
            low = grade3;
      else
         if (grade2 < grade3)
            low = grade2;
         else
            low = grade3;
      if (low < grade4)
         lowest = low;
      else 
         lowest = grade4;
   
      System.out.println ("Lowest Grade : " + lowest);
      
      average = (grade1 + grade2 + grade3 + grade4) / 4.0 ;
      System.out.print("The average is :" + average);
      
   }
}