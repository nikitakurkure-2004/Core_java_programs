class CalculatePercentage
{
   public static void main(String[]args)
  {

       double marathi = 95.00;
       double hindi = 83.00;
       double geography= 91.00;
       double science= 96.00;
       double history= 85.00;
       double english= 94.00;


      double total_marks_obtained = marathi + hindi + geography + science + history + english;
      double  total_marks=600;
      
     double percentage;
     
     percentage = (total_marks_obtained /600) *100;
     System.out.println(percentage);
}}
 