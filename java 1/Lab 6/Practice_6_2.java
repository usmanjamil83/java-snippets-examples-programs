// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        6

public class Practice_6_2
{
   public static void main (String[] args)
   {
      final int LIMIT = 10;

      for (int row = 1; row <= LIMIT; row++)
      {
         for (int star = 1; star <= LIMIT-row+1; star++)
            System.out.print ("*");

         System.out.println();
      }
   }
}
