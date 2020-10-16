public class EmployeeWage{
   public static final int Is_Full_Time=1;
   public static final int Is_Part_Time=2;

   public static int EmpWage(String company,int Emp_Rate_Per_Hour,int Num_Of_Work_Days,int Max_Hrs_In_Mnth){
      int empHrs=0;
      int totalEmpHrs=0;
      int totalWorkDays=0;

      while(totalEmpHrs<= Max_Hrs_In_Mnth && totalWorkDays < Num_Of_Work_Days){
            totalWorkDays++;
            int empCheck=(int) Math.floor(Math.random()*10)%3;
            switch(empCheck){
               case Is_Full_Time:
                  empHrs=8;
                  break;
               case Is_Part_Time:
                  empHrs=4;
                  break;
               default:
                  empHrs=0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day #: " + totalWorkDays + "Emp Hour: " + empHrs);
         }
         int totalEmpWage=totalEmpHrs*Emp_Rate_Per_Hour;
         System.out.println("Total Emp Wage for Company: " +company+ " is " + totalEmpWage);
         return totalEmpWage;
   }
   public static void main(String[] args){
      EmpWage("RelianceFresh",300,20,100);
		EmpWage("Spencers",300,25,80);
   	EmpWage("Vijetha",500,20,60);
		EmpWage("Tata",350,20,90);
	}
}

