public class EmpWageBuilder{
	//CONSTANTS 
	public static final int IS_PART_TIME=0;
	public static final int IS_FULL_TIME=1;
	private final String company;
	private final int EMPLOYEE_WAGE_PER_HOUR;
	private final int NUM_OF_WORKING_DAYS;
	private final int MAX_HOURS_PER_MONTH;
	private int TOTAL_EMP_WAGE;
	
	public EmpWageBuilder(String company, int EMPLOYEE_WAGE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HOURS_PER_MONTH){
		this.company=company;
		this.EMPLOYEE_WAGE_PER_HOUR=EMPLOYEE_WAGE_PER_HOUR;
		this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
		this.MAX_HOURS_PER_MONTH=MAX_HOURS_PER_MONTH;
	}

	public void EmpWage(){
		//VARIABLES
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		int totalWorkingDays=0;
		int totalEmpHrs=0;

		//COMPUTATION
		while(totalEmpHrs <= MAX_HOURS_PER_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
			totalWorkingDays++;	
			int empCheck=((int) Math.floor(Math.random() *10))% 3;
		
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
			System.out.println("Day : " + totalWorkingDays + "Employee hours : " + empHrs);
		}
		TOTAL_EMP_WAGE=totalEmpHrs * EMPLOYEE_WAGE_PER_HOUR;
	}
	public String toString(){
		return "Total EmpWage for Company: " +company+ " is: " + TOTAL_EMP_WAGE;
	}

	public static void main(String args[]){
		System.out.println("Employee Wage Computation");
		EmpWageBuilder WIPRO=new EmpWageBuilder("WIPRO",20,10,100);
		WIPRO.EmpWage();
		System.out.println("Total Employee Wage WIPRO : "+WIPRO);
		EmpWageBuilder SBI=new EmpWageBuilder("SBI",20,10,100);
		SBI.EmpWage();
		System.out.println("Total Employee Wage SBI : "+SBI);

	}
}
