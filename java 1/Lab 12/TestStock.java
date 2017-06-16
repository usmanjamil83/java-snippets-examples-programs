public class TestStock{

   public static void main(String[] args) {
   //Driver Program for all testing and Instantiation     
      Stock stock1 = new Stock ("ORCL", "Oracle Corporation", 34.5);
      System.out.println(stock1.toString());
      stock1.setCurrentPrice(34.35);
      System.out.println(stock1.toString() + ". The percent change is: " + stock1.getChangePercent());
      System.out.println();
      
      Stock stock2 = new Stock ("MS", "Microsoft Corporation", 34.5);
      System.out.println(stock2.toString());
      stock1.setCurrentPrice(34.35);
      System.out.println(stock2.toString() + ". The percent change is: "  + stock1.getChangePercent());
      System.out.println();
      
      Stock stock3 = new Stock ("GOOG", "Google Corporation", 34.5);
      System.out.println(stock3.toString());
      stock1.setCurrentPrice(34.35);
      System.out.println(stock3.toString() + ". The percent change is: " + stock1.getChangePercent());
      
   }

}