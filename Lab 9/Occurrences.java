import java.util.Scanner;
public class Occurrences
{
   public static void main(String[] args)
   {
   int restart;
      do
      {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string:");
      String s1 = input.nextLine();
      System.out.print("Enter a charecter:");
      char ch = input.nextLine().charAt(0);
      System.out.println("the number of " + ch + " in the string is " + count(s1, ch));
      System.out.print ("\nTo rerun the program? (1 for yes, any other for no): ");
         restart = input.nextInt();
      } while (restart == 1);
   }
   public static int count(String str, char a)
   {
      int count = 0;
      for (int i = 0; i < str.length(); i++)
      {
         if (str.charAt(i) == a)
            count++;
      }
      return count;
   }
}