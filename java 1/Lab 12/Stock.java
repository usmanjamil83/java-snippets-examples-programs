public class Stock {
//Set Data fields
   public String symbol;
   public String sName;
   public double previousClosingPrice = 34.5;
   public double currentPrice = 0;

//Default Constructor
   public Stock(){
      
   }
   
//Constructor with previous closing price parameter
   public Stock(String newSymbol, String newSName, double newPreviousClosingPrice) {
      this.symbol = newSymbol;
      this.sName = newSName;
      this.currentPrice = newPreviousClosingPrice;
   
   }
   
//Return Percent Change
   double getChangePercent(){
      return (((previousClosingPrice - this.currentPrice)/previousClosingPrice)*100);
   }
   
//Set a new Current Price
   double setCurrentPrice(double newCurrentPrice){
      this.currentPrice = newCurrentPrice;
      return this.currentPrice;
   }

   @Override
   public String toString() {
      // TODO Auto-generated method stub
      String total = "The symbol is: " + this.symbol + " and the name is: " + this.sName + " and the previous closing price is: " + this.currentPrice;
      return total;
      
   }

}