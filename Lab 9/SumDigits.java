import java.util.Scanner;
public class SumDigits
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int restart;
      do
      {
         System.out.print("Enter an integer:");
         long n = input.nextLong();
         System.out.println("The sum is " + sumDigits(n));
         System.out.print ("\nTo rerun the program? (1 for yes, any other for no): ");
         restart = input.nextInt();
      } while (restart == 1);
   }
   public static int sumDigits(long n)
   {
      int sum = 0;
      do
      {
         sum += n % 10;
      }
      while ((n = n / 10) != 0);
      return sum;
   }
}