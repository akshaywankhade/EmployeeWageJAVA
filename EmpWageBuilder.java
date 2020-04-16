public class EmpWageBuilder{
	//CONSTANTS 
	public static final int EMPLOYEE_WAGE_PER_HOUR=20;
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	public static void main (String[] args){
		//VARIABLES
		int empHrs=0;
		int empWage=0;

		//COMPUTATION
		int empCheck=((int)Math.floor(Math.random() *10))% 2;
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
			empWage=empHrs * EMPLOYEE_WAGE_PER_HOUR;
			System.out.println("Employee Wage: "+empWage);
		}
}
