// Class:      CS1301/10
// Term:       Fall 2015
// Name:       Usman Jamil
// Instructor: Dr. Yong Shi
// Lab:        4

import java.util.Scanner;
public class AddThreeNumbers
{
   public static void main(String[] args)
   {
      int number1 = (int)(System.currentTimeMillis() % 10);
      int number2 = (int)(System.currentTimeMillis() / 5 % 10);
      int number3 = (int)(System.currentTimeMillis() / 10 % 10);
      Scanner input = new Scanner(System.in);
      System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
      int answer = input.nextInt();
      System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is "
       +(number1 + number2 + number3 == answer));
   }
}