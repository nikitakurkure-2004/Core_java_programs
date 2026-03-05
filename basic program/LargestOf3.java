class LargestOf3{
public static void main(String[]args){
   int num1 = 10;
   int num2 = 20;
   int num3 = 30;

  String result = (num1 > num2 && num1 > num3)? num1+ "is Large" : (num2 > num3) ? num2+ "is large" : num3+ "is large";

System.out.println(result);
}
}