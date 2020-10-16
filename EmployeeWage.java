public class EmployeeWage {
   public static final int Is_Full_Time=1;
   public static final int Is_Part_Time=2;

	private final String company;
	private final int Emp_Rate_Per_Hour;
	private final int Num_Of_Work_Days;
	private final int Max_Hrs_In_Mnth;
	private  int totalEmpWage;
   public EmployeeWage(String company,int Emp_Rate_Per_Hour,int Num_Of_Work_Days,int Max_Hrs_In_Mnth)
		 {
      	this.company=company;
			this.Emp_Rate_Per_Hour=Emp_Rate_Per_Hour;
			this.Num_Of_Work_Days=Num_Of_Work_Days;
			this.Max_Hrs_In_Mnth=Max_Hrs_In_Mnth;
	    }

	public void EmpWage()
	 {
		int empHrs=0;
      int totalEmpHrs=0;
      int totalWorkDays=0;

      while(totalEmpHrs<= Max_Hrs_In_Mnth && totalWorkDays < Num_Of_Work_Days)
			{
            totalWorkDays++;
            int empCheck=(int) Math.floor(Math.random()*10)%3;
            switch(empCheck)
				{
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
         totalEmpWage=totalEmpHrs*Emp_Rate_Per_Hour;
    }
	@Override
	public String toString(){
		return "Total Employee Wage for Company: " +company+ " is "+totalEmpWage;
		}
   public static void main(String[] args){
		EmployeeWage reliance=new EmployeeWage("RelianceFresh",300,20,100);
      EmployeeWage spencers=new EmployeeWage("Spencers",300,25,80);
		EmployeeWage vijetha=new EmployeeWage("Vijetha",400,20,90);
		reliance.EmpWage();
		System.out.println(reliance);
		spencers.EmpWage();
		System.out.println(spencers);
		vijetha.EmpWage();
		System.out.println(vijetha);
   }
}



