// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        6

//********************************************************************
// Stars.java Author: Lewis/Loftus
// Demonstrates the use of nested for loops.
//********************************************************************
public class Stars
{
 //-----------------------------------------------------------------
 // Prints a triangle shape using asterisk (star) characters.
 //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int MAX_ROWS = 10;
      for (int row = 1; row <= MAX_ROWS; row = row + 1)
      {
         for (int star = 1; star <= row; star = star + 1)
            System.out.print ("*");
      
         System.out.println();
      }
   }
}