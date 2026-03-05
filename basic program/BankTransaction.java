//Person with bank balance of 25000,deposite 300 withdraw 200,store all these and display the final balance and transaction
class BankTransaction{
   public static void main(String[]args){
           
            double balance = 25000;
            double deposite = 300;
            double withdraw = 200;

            System.out.println("Current Balance :"+balance);
       
            //After deposite 300 
            balance+=deposite;
            System.out.println("Current Balance :"+balance);
      
           //After withdraw 200
           balance-=withdraw;
           System.out.println("Current Balance :"+balance);
 }
}

           
