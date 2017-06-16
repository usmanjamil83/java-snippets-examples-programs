import java.util.Scanner;
public class CountOccurrences
{
   public static void main(String[] args)
   {
      int restart;
      do
      {
         Scanner input = new Scanner(System.in);
         int[] numbers = new int[0];
         int number;
         System.out.print("Enter the integers between 1 and 100:");
         while ((number = input.nextInt()) != 0)
         {
            numbers = add2Array(numbers, number);
         }
         int searchNumber = 0, searchCount = 0;
         for (int j = 0; j < numbers.length; j++)
         {
            if (searchNumber != numbers[j] && numbers[j] != 0)
            {
               searchNumber = numbers[j];
               for (int i = j; i < numbers.length; i++)
               {
                  if (searchNumber == numbers[i])
                  {
                     searchCount++;
                     numbers[i] = 0;
                  }
               }
               System.out.print(searchNumber + " occurs " + searchCount + " time");
               if (searchCount > 1)
               {
                  System.out.println("s");
               }
               else
               {
                  System.out.println();
               }
               searchCount = 0;
            }
         }
         System.out.print ("\nTo rerun press (1), To stop press (2)");
         restart = input.nextInt();
      } while (restart == 1);
   }
   public static boolean copyArray(int[] source, int[] dest)
   {
      if (source.length > dest.length)
         return false;
      for (int i = 0; i < source.length; i++)
      {
         dest[i] = source[i];
      }
      return true;
   }
   public static int[] add2Array(int[] source, int data)
   {
      int[] dest = new int[source.length + 1];
      copyArray(source, dest);
      dest[source.length] = data;
      return dest;
   }
}