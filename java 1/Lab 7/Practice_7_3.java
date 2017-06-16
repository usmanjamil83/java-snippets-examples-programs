// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        7
public class  Practice_7_3
{
   public static void main(String[] args)
   {
      for (int i = 1; i < 16; i += 2)
      {
         for (int j = 0; j < 9 - i / 2; j++)
            System.out.print(" ");
         for (int j = 0; j < i; j++)
            System.out.print("*");
         System.out.print("\n");
      }
   }
}