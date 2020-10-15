public class EmpWage{
   public static void main(String[] args){
      int is_Present=1,empHrs,empWage;
		int Wage_Per_HR=20;
      double EmpChck=Math.floor(Math.random()*2)%2;
            if(EmpChck==is_Present){
         	System.out.println("Employee is present");
        		empHrs=8;
 				}
      else
			empHrs=0;
			empWage=empHrs*Wage_Per_HR;
			System.out.println(empWage);
   }
}
