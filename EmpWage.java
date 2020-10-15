public class EmpWage{
   public static void main(String[] args){
      //Employee Check
      int is_Present=1;
      int is_Part_Time=2;

      //Variables
      int empHrs,empWage;
      int Wage_Per_HR=20;

      //RndmCheck
      int EmpChck=(int) Math.floor(Math.random()*10)%3;
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
			empWage=empHrs*Wage_Per_HR;
			System.out.println(empWage);
   }
}

