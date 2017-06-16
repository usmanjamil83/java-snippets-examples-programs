// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 7

public class DivisiblesBy5And6
{
   public static void main(String[] args)
   {
      int itemCount = 0;
      for(int i=100; i<=200; i++)
      {
         if(i%5 == 0 ^ i%6 == 0)
            System.out.print(i + " ");
         itemCount +=1; 
         if(itemCount==10)
            System.out.println("\n");
         itemCount = 0;
      }
   }
}