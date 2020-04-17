public class EmpWageBuilder{
	//CONSTANTS 
	public static final int IS_PART_TIME=0;
	public static final int IS_FULL_TIME=1;
	public int EMPLOYEE_WAGE_PER_HOUR;
	public int NUMBER_OF_WORKING_DAYS;
	public int MAX_HRS_IN_MONTH;
	
	public EmpWageBuilder(int EMPLOYEE_WAGE_PER_HOUR,int NUMBER_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH){
		this.EMPLOYEE_WAGE_PER_HOUR=EMPLOYEE_WAGE_PER_HOUR;
		this.NUMBER_OF_WORKING_DAYS=NUMBER_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
	}

	public void EmpWage(){
		//VARIABLES
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		int totalWorkingDays=0;
		int totalEmpHrs=0;

		//COMPUTATION
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUMBER_OF_WORKING_DAYS){
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
	public static void main(String args[]){
		EmpWageBuilder WIPRO=new EmpWageBuilder(20,20,100);
		EmpWageBuilder SBI=new EmpWageBuilder(20,20,100);
		EmpWageBuilder RBI=new EmpWageBuilder(20,20,100);
		WIPRO.EmpWage();
		SBI.EmpWage();
		RBI.EmpWage();
	}
}
