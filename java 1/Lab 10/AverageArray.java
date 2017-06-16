import java.util.Scanner;
public class AverageArray
{
   public static void main(String[] args)
   {
      int restart;
      do
      {
         System.out.print("Enter the 10 floating numbers:");
         Scanner input = new Scanner(System.in);
         double[] numbers = new double[10];
         for (int i = 0; i < numbers.length; i++)
         {
            numbers[i] = input.nextDouble();
         }
         System.out.println("The average is " + average(numbers));
         System.out.print ("\nTo rerun press (1), To stop press (2)");
         restart = input.nextInt();
      } while (restart == 1);
   }
   public static int average(int[] array)
   {
      int sum = 0;
      for (int i = 0; i < array.length; i++)
      {
         sum += array[i];
      }
      return sum / array.length;
   }
   public static double average(double[] array)
   {
      double sum = 0;
      for (int i = 0; i < array.length; i++)
      {
         sum += array[i];
      }
      return sum / array.length;
   }
}