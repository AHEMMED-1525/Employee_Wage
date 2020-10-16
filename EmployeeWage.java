public class EmployeeWage{
	public static final int Is_Full_Time=1;
	public static final int Is_Part_Time=2;
	public static final int Emp_Rate_Per_Hour=20;
	public static final int Num_Of_Work_Days=20;
	public static final int Max_Hrs_In_Mnth=100;

	public static int EmpWage(){
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
			System.out.println("Total Emp Wage: " + totalEmpWage);
			return totalEmpWage;
	}
	public static void main(String[] args){
		EmpWage();
	}
}
