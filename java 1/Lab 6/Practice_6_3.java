// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        6

public class Practice_6_3
{
   public static void main(String[] args)
   {
      int i = 0;
      int n = 0;
      int x = 50;
      int z = 50;
      System.out.print("Evens between 50 and 100:\t");
      while(i < x)
      {
         System.out.print(i + x + ",");
         i +=2;
      }
      System.out.print("100\n\n");
      System.out.print("Odds between 50 and 100:\t");
      n= 1;
      while(n < z - 1)
      {
         System.out.print(n + z + ",");
         n +=2;
      }
      System.out.print("99");
   }
}