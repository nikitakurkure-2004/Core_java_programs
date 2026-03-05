//write a program to find total marks obtained and percentage of student also with his details
class StudentDetails{
      public static void main(String[]args){
   
                String name = "Nikita kurkure";
                String std = "CSE";
                long rollNo = 23201001;
                long phoneNo = 9322353231L;
                int age = 21;
                String emailId = "kurkurenikita760@gmail.com";
               
                int marathi=96;
                int hindi = 85;
                int science = 98;
                int history = 96;
                int english =83;
                int geography= 90;
                

                int obtain_marks = marathi+hindi+science+history+english+geography;

                double percentage ;
                percentage = (obtain_marks * 100.0/600);

                System.out.println("Name:"+name);
                System.out.println("Class:"+std);
                System.out.println("RollNo:"+rollNo);
                System.out.println("Age:"+age);
                System.out.println("EmailId:"+emailId);
                System.out.println("Percentage :"+percentage);
 }
}
                