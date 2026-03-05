//Arithmetic Operation
class ExtractAndRemoveLastDigit{
   
          public static void main(String[] args){
                    
                   int num = 459;    //if we want to Extract last two digit use 100
              
                   int lastDigit = num % 10;
              
                   System.out.println("Last Digit : " +lastDigit);
                   
                   num = num / 10;  //if we want to remove last two digit use 100
  
                   System.out.println("Remove The Last Digitl : " +num);
}
}