import java.util.Scanner;
public class EmpWage{

   public static void main(String[] args){
		 /*Employee Check
         int is_Present=1;
         int is_Part_Time=2;
		*/
         int Wage_Per_HR=500;
         int Num_of_Days_Mnth=20;
         int Work_Hrs=100;

      //Variables
      int empHrs,totalHrs=0,TotalwrkDays=0,totalempWage=0,Salary=0;
		//Computation

		while(TotalwrkDays<=Num_of_Days_Mnth && totalHrs< Work_Hrs){
      TotalwrkDays++;
		//RndmCheck
      //int EmpChck=(int) Math.floor(Math.random()*10)%3;
         Scanner sc=new Scanner(System.in);
         System.out.println("Please Enter 1 for Full time or 2 for Part Time to Know your Regularity : ");
         int EmpChck=sc.nextInt();
      switch(EmpChck){
         case 1:
            empHrs=8;
            break;
         case 2:
            empHrs=4;
            break;
         default:
            empHrs=0;
        }
			int empWage_Per_Day=empHrs*Wage_Per_HR;
         totalHrs +=empHrs;
         System.out.println("Day# "+TotalwrkDays+ " Emp Hr: "+empHrs+ " " +empWage_Per_Day);
		}
			totalempWage=totalHrs*Wage_Per_HR;
			System.out.println("Total Emp Wage: " + totalempWage);
   }
}
