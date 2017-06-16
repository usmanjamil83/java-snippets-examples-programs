import java.util.Scanner;
public class RowSorting
{
   public static void main(String[] args)
   {
      int restart;
      do
      {
         double[][] m = new double[3][3];
         Scanner
             input = new Scanner(System.in);
         System.out.println("Enter a 3-by-3 matrix row by row: ");
         for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
               m[i][j] = input.nextDouble();
         double[][] sorted = sortRows(m);
         displayMatrix(sorted);
         System.out.print ("\nTo rerun press (1), To stop press (2): ");
         restart = input.nextInt();
      } while (restart == 1);
   }
   public static void displayMatrix(double[][] m)
   {
      for (int i = 0; i < m.length; i++)
      {
         for (int j = 0; j < m[i].length; j++)
         {
            System.out.printf("%2.3f ", m[i][j]);
         }
         System.out.println("");
      }
   }
   public static double[][] sortRows(double[][] m)
   {
      double[][] sortedRows = new double[m.length][m[0].length];
      for (int i = 0; i < m.length; i++)
         for (int j = 0; j < m[0].length; j++)
            sortedRows[i][j] = m[i][j];
      for (int i = 0; i < sortedRows.length; i++)
      {
         for (int j = 0; j < sortedRows[0].length - 1; j++)
         {
            double currentMin = sortedRows[i][j];
            int minIndex = j;
            for (int column = j + 1; column < sortedRows[0].length; column++)
            {
               if (currentMin > sortedRows[i][column])
               {
                  currentMin = sortedRows[i][column];
                  minIndex = column;
               }
            }
            if (minIndex != j)
            {
               sortedRows[i][minIndex] = sortedRows[i][j];
               sortedRows[i][j] = currentMin;
            }
         }
      }
      return sortedRows;
   }
}