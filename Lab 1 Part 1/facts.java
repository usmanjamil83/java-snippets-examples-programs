//*********************************************************
//Facts.java        Author:Lewis/Loftus
//Demonstrates the use of the string concatenatin operator
//and the automatic conversion of an integer to a string.
//*********************************************************
public class facts
{
//------------------------------------------------------------
//Print various facts.
//------------------------------------------------------------
   public static void main (String[] args)
   {
   // String can be concatenated into one long string
      System.out.println ("We present the following facts for your"
         + " extracurricular adification:");
      System.out.println ();
   
   //A string can contain numeric digits
      System.out.println ("Letters in the Hawaiian alphabet: 12");
   
   // A numeric value can be concatenated to a string
      System.out.println ("Diling code for Antarctica:" + 672);
      System.out.println("Year in which Leonardo da  Vinci invented"
         + " the parachute: " + 1515);
      System.out.println ("Speed of Ketchup: " + 40 + "km per year");
   }
}