public class EmpWage{
   public static void main(String[] args){
		//Employee Check
      int is_Present=1;
		int is_Part_Time=2;

		//Variables
		int empHrs,empWage;
		int Wage_Per_HR=20;

		//RndmCheck
      double EmpChck=Math.floor(Math.random()*10)%3;

				if(EmpChck==is_Present){
        		empHrs=8;
 				}
				else if(EmpChck==is_Part_Time){
					empHrs=4;
				}
      		else
				empHrs=0;
				empWage=empHrs*Wage_Per_HR;
				System.out.println(empWage);
   }
}
