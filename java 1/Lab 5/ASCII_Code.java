import java.util.Scanner; 
public class ASCII_Code
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
     
      System.out.print("Enter an ASCII code:");
      int s = input.nextInt();
     
      System.out.print("The character for ASCII code " + s + " is "
          + (char) s);
     
   }
   
}
