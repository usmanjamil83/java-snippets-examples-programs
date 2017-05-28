import java.util.Scanner;
public class Practice_6_4
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Entered String: ");
      String word = scan.next();
   
      for(char a : word.toCharArray())
      {
         System.out.println( "Character #: " + a);
      }
   }
}