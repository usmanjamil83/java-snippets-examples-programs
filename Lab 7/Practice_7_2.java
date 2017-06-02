import java.util.Scanner;
public class Practice_7_2 
{
   public static int getNumberOfWords(String sentence)
   {
      int counter=0;
      for(int i=0;i<sentence.length();i++)
      {
         if(sentence.charAt(i)==' ')counter++;
      }
      return counter+1;
   }
   public static char[] getSubString(String sentence,int start,int end)
   {
      int counter=0;
      char charArrayToReturn[]=new char[end-start];
      for(int i=start;i<end;i++)
         charArrayToReturn[counter++]=sentence.charAt(i);
      return charArrayToReturn;
   }
   public static char[][] getWordsFromString(String sentence)
   {
      int wordsCounter=0;
      int spaceIndex=0;
      int length=sentence.length();
      char wordsArray[][]=new char[getNumberOfWords(sentence)][]; 
      for(int i=0;i<length;i++)
      {
         if(sentence.charAt(i)==' ' || i+1==length)
         {
            wordsArray[wordsCounter++]=getSubString(sentence, spaceIndex,i+1);
            spaceIndex=i+1;
         }
      }
      return  wordsArray;
         }

   public static void main(String[] args) 
   {
      System.out.println("Please enter the String");
      Scanner input=new Scanner(System.in);
      String userInput=input.nextLine().trim();
      int numOfWords=getNumberOfWords(userInput);
      char words[][]=new char[numOfWords+1][];
      words=getWordsFromString(userInput);
      System.out.println("Entered String: "+(userInput));
      for(int i=0;i<numOfWords;i++)
      {
         System.out.println(" ");
         for(int j=0;j<words[i].length;j++)
         {
            System.out.print(words[i][j]);
         }
      }
   }

}