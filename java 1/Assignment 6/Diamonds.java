// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 6

public class Diamonds
{
   public static void main(String[] args)
   {
      for (int i = 1; i < 10; i += 2)
      {
         for (int j = 0; j < 9 - i / 2; j++)
            System.out.print(" ");
         for (int j = 0; j < i; j++)
            System.out.print("*");
         System.out.print("\n");
      }
      for (int i = 7; i > 0; i -= 2)
      {
         for (int j = 0; j < 9 - i / 2; j++)
            System.out.print(" ");
         for (int j = 0; j < i; j++)
            System.out.print("*");
         System.out.print("\n");         
      }
      System.out.println();
      System.out.println();
      for (int i = 9; i > 0; i -= 2)
      {
         for (int j = 0; j < 9 - i / 2; j++)
            System.out.print(" ");
         for (int j = 0; j < i; j++)
            System.out.print("*");
         System.out.print("\n");
      }
      for (int i = 2; i < 10; i += 2)
      {
         for (int j = 0; j < 9 - i / 2; j++)
            System.out.print(" ");
         for (int j = 0; j <= i; j++)
            System.out.print("*");
         System.out.print("\n");
      }
   }
}