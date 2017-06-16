import java.util.Scanner;
public class Practice_7_4
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter string, Enter 1 when finished.\n");
      int[] letterCounts = new int[26];
      boolean stop = false;
      String line;
      while (!stop) {
         line = in.nextLine();
         if (line.equals("1")) {
            stop = true;
         } 
         else {
            for (int i = 0; i < line.length(); i++) {
               char ch = line.charAt(i);
               if (Character.isLetter(ch)) {
                  ch = Character.toLowerCase(ch);
                  int index = ch - 'a';
                  letterCounts[index]++;
               }
            }
         }
      }
      for (char ch = 'a'; ch <= 'z'; ch++) {
         int index = ch - 'a';
         System.out.println("Letter " + ch + ": " + letterCounts[index]);
      }
   }
}
