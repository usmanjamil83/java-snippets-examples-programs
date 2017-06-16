import java.util.Scanner;
import java.util.Date;
import javax.swing.JOptionPane;

public class Account {

   private int id;
   private double balance;
   private double annualInterestRate;
   private Date dateCreated = new Date() ;
   private double withdraw ;
   private double deposit;

   Scanner keyboard = new Scanner(System.in) ;
   Account(){
   
      id=0;
      balance = 0;
      annualInterestRate = 0;
      dateCreated = new Date();
   }
   Account(int idIn, double balanceIn, double annualInterestRateIn,double withdraw,double deposit){
      id = idIn;
      balance = balanceIn ;
   
      annualInterestRate = annualInterestRateIn;
   
   }
//Method (getters or Accessors)
   Date dateCreated(){
      return dateCreated;
   }
   int getId(){
      return id;
   }
   double getBalance(){
      return balance;
   }
   double getAnnualInterstRate(){
      return annualInterestRate/100;
   }
   double getMonthlyInterest(){
   
      return balance * getMonthlyInterestRate();
   }

   double getMonthlyInterestRate(){
   
      return annualInterestRate/12;
   }

   double getWithdraw(){
      return withdraw;
   }
   double getDeposit(){
   
      return deposit;
   }

///////////////////////////////////////////////////////////

//Methods(setters or mutators)

   void setId(int idIn){
      System.out.print("Please enter your ID");
      idIn = keyboard.nextInt();
   
      while(idIn<=0){
         String input = JOptionPane.showInputDialog("Incorrect Id! Try Again.");
         idIn = Integer.parseInt(input);
      }
      id= idIn;
   
   }
   void setBalance(double balanceIn){
      System.out.print("Please enter your Balance");
      balanceIn = keyboard.nextInt();
   
      while(balanceIn<=0){
         String input = JOptionPane.showInputDialog("Incorrect Balance! Try Again.");
         balanceIn = Double.parseDouble(input);
      }
      balance= balanceIn;
   
   }

   void setAnnualInterestRate(double annualInterestRateIn ){
      System.out.print("Please enter your Balance");
   
      annualInterestRateIn = keyboard.nextInt();
   
      while(annualInterestRateIn<=0){
         String input = JOptionPane.showInputDialog("Incorrect annual interst Rate ! Try Again.");
         annualInterestRateIn = Double.parseDouble(input);
      }
      annualInterestRate = annualInterestRateIn;
   }
}