// Class: CS 1301/10
// Term: Fall 2015
// Name: Usman Jamil
// Instructor: Dr. Yong Shi
// Assignment: 6

public class EvenOdd
{
   public static void main(String[]args)
   {
      StringBuilder even = new StringBuilder();
      StringBuilder odd = new StringBuilder();

      int e = 50;
      while (e <= 98) {
         if (e%2 == 0)
             even.append ( e + ",");
         else
             odd.append ( e + ",");
         e++;
      }
      System.out.print("Even numbers between 50 and 100: " + even.toString() + 100);
      System.out.print("\nOdd numbers between 50 and 100 : " + odd.toString() + 99);
   }
}