class CompounAssignmentOperator{
    public static void main(String[]args){

             //Show the transaction and update balance
                      double balance = 6800.0;
                      double iceCreamPrice = 80.0;
                      double remoteCarPrice = 589.0;
                      double deposite = 500;
      
                    balance -= iceCreamPrice;
                    System.out.println("After Buying "+iceCreamPrice+" icecream total balance : "+balance);
             
                    balance -= remoteCarPrice;
                    System.out.println("After Buying "+remoteCarPrice+" remotecartotal balance : "+balance);  
    
                    balance += deposite;
                    System.out.println("After deposite "+deposite+" total balance : "+balance);



           //Show the updated salary after the 25% of Hike
              
                   double sal = 4500.0;
                   sal *= 1.25;   // sal+sal*25/100 
                                 // sal *1 + sal*0.25
                                 //sal (1+0.25) = sal(1.25)
                    System.out.println("After the Hike Salaray is :" +sal);



          //Show split the expenses 
                  double spentAmt = 50000;
                  int noOfPeople = 3;
 
                  spentAmt /= noOfPeople;
                  System.out.println("Individual amount :" +spentAmt);


                                        
             

}
}