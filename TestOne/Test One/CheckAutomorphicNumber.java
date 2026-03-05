//write a program to check the given number is automorphic No or Not

import java.util.*;
class CheckAutomorphicNumber{
      public static void main(String[]args)
        {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a Number");
          int num = sc.nextInt();

          int res = num * num;
          int lastDigit = res % 10;
        
          if(lastDigit == num )
          {
              System.out.println(num +"is automorphic Number");
          }
          else
         {
          System.out.println(num +"is not automorphic Number");
         }
             
 }
}

