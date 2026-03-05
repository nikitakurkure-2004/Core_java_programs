class LargeOf4{
 public static void main(String[]args){
    int num1 = -91;
    int num2 = 37;
    int num3 =  4;
    int num4 = 02;

String result = (num1 > num2 && num1 > num3 && num1 > num4) ? num1+ "is large": (num2 > num3 && num2 > num4) ? num2+ "is large": (num3 > num4) ? num3+ "is large": num4+ "is large";


System.out.println(result);
}
}