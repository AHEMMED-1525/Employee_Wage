public class CompanyEmpWage{

   public final String company;
   public final int Emp_Rate_Per_Hour;
   public final int Num_Of_Work_Days;
   public final int Max_Hrs_In_Mnth;
   public int totalEmpWage;

   public CompanyEmpWage(String company,int Emp_Rate_Per_Hour,int Num_Of_Work_Days,int Max_Hrs_In_Mnth)
   {
      this.company=company;
      this.Emp_Rate_Per_Hour= Emp_Rate_Per_Hour;
      this.Num_Of_Work_Days=Num_Of_Work_Days;
      this.Max_Hrs_In_Mnth=Max_Hrs_In_Mnth;
   }

   public void setTotalEmpWage(int totalEmpWage)
   {
      this.totalEmpWage=totalEmpWage;
   }

      @Override
   public String toString()
   {
      return "Total Employee Wage for Company: " +company+ " is "+totalEmpWage;
    }
}

