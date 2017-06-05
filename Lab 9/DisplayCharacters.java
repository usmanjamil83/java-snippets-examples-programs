import java.util.Scanner;
public class DisplayCharacters
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int restart;
      do
      {
         printChars('1', 'Z', 10);
         System.out.print ("\nTo rerun the program? (1 for yes, any other for no): ");
         restart = input.nextInt();
      } while (restart == 1);
   }
   public static void printChars(char ch1, char ch2, int NumberPerLine)
   {
      int difference = (int) (ch2 - ch1);
   
      for (int i = 1; i < difference; i++) {
         System.out.print(++ch1 + " ");
         if (i % NumberPerLine == 0) { 
            System.out.print("\n");
         }
      }
   }
}