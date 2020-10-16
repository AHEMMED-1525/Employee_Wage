	public class EmployeeWage {
   public static final int Is_Full_Time=1;
   public static final int Is_Part_Time=2;

	private  int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWage()
	{
		companyEmpWageArray=new CompanyEmpWage[5];
	}

   public void addCompanyEmpWage(String company,int Emp_Rate_Per_Hour,int Num_Of_Work_Days,int Max_Hrs_In_Mnth)
		 {
			companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,Emp_Rate_Per_Hour,Num_Of_Work_Days,Max_Hrs_In_Mnth);
			numOfCompany++;
	    }

	private void computeEmpWage(){
	for(int i=0;i<numOfCompany;i++){
		companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage)
	 {
		int empHrs=0;
      int totalEmpHrs=0;
      int totalWorkDays=0;

      while(totalEmpHrs<= companyEmpWage.Max_Hrs_In_Mnth && totalWorkDays < companyEmpWage.Num_Of_Work_Days)
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
         return totalEmpHrs*companyEmpWage.Emp_Rate_Per_Hour;
    }
   public static void main(String[] args){
		EmployeeWage empWageBuilder=new EmployeeWage();
		empWageBuilder.addCompanyEmpWage("Spencers",300,25,80);
      empWageBuilder.addCompanyEmpWage("Vijetha",400,20,90);

		empWageBuilder.computeEmpWage();
   }
}
