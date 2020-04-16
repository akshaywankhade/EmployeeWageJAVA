public class EmpWageBuilder{
	//CONSTANTS 
	public static final int EMPLOYEE_WAGE_PER_HOUR=20;
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int NUMBER_OF_WORKING_DAYS=20;
	public static final int MAX_WORKING_HOUR=100;
	public static final int MAX_WORKING_DAYS=20;

	public static void main (String[] args){
		//VARIABLES
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		int totalWorkingDays=0;
		int totalEmpHrs=0;

		//COMPUTATION
		while(totalEmpHrs<MAX_WORKING_HOUR && totalWorkingDays<MAX_WORKING_DAYS){
			totalWorkingDays++;	
			int empCheck=((int)Math.floor(Math.random() *10))% 3;
		
			switch(empCheck){
				case IS_FULL_TIME:
					empHrs=8;
					break;
				case IS_PART_TIME:
					empHrs=4;
					break;
				default:
					empHrs=0;
			}
				totalEmpHrs += empHrs;
				empWage=empHrs * EMPLOYEE_WAGE_PER_HOUR;
				totalEmpWage += empWage;
		}
		System.out.println("Employee Wage Month: "+totalEmpWage);
		}
}
