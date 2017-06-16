public class TestAccount {

   public static void main(String[] args) {
      Account account;
      account = new Account(1122, 20000.0, 0.045,2500.0,3000.0);
      System.out.println ("Account number: "+ account.getId());
      System.out.println ("The account balance is: $ " + account.getBalance());
      System.out.println ("The monthly interest earned is: $ " + account.getMonthlyInterest() );
      System.out.println ("The account was created on: " + account.dateCreated());
   
   }

}