// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        3

import java.util.*;
public class Practice_3_5
{
   public static void main (String[] args)
   {
      final int MAX = 9;
      int N1, N2, N3, Sum;
   
      Scanner scan = new Scanner (System.in); // scanner object
      Random generator = new Random(); // random number generator object
      N1 = generator.nextInt(MAX) + 1;
      N2 = generator.nextInt(MAX) + 1;
      N3 = generator.nextInt(MAX) + 1;
      
      System.out.print ("What is the sum of " + N1 + " + " + N2 + " + " + N3 + "?  ");
      Sum = scan.nextInt();
      
      if (Sum == N1+N2+N3)
         System.out.println ("You entered " + Sum + "\nCorrect!" );
      else
      {
         System.out.println ("You entered " + Sum + "\nIncorrect! The corrent answer is " + (N1+N2+N3));
      }
   }
}