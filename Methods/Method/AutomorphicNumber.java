import java.util.Scanner;
class AutomorphicNumber{
   
         
           public static boolean automorphicNumber(int num){

               int temp = num;
               int square = num * num;
               int divisor = 1;

               while(num!=0)
               {
                  divisor = divisor * 10;
                  num = num/10;    
               }
                
               return (square % divisor == temp);
          }

       public static void main(String[] args)
       {
           System.out.print("Enter a Number");
           Scanner sc = new Scanner(System.in);
           int num = sc.nextInt();

             if(automorphicNumber(num))
               {
                 System.out.println(num+" Is Automorphic Number");
               }
             else
               {
                 System.out.println(num+" Is Not Automorphic Number");
               }
             System.out.println("Enter a start range");
             int start = sc.nextInt();
             System.out.println("Enter a end range");
             int end = sc.nextInt();

            for(int i=start;i<=end;i++)
             {
                 if(automorphicNumber(i))
                 {
                    System.out.println(automorphicNumber(i));
          
                 }

           }

      }
}
