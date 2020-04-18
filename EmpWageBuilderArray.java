public class EmpWageBuilderArray {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderArray(){
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompanyEMpWage(String company, int EMPLOYEE_WAGE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HOURS_PER_MONTH){
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, EMPLOYEE_WAGE_PER_HOUR, NUM_OF_WORKING_DAYS, MAX_HOURS_PER_MONTH);
		numOfCompany++;
	}
	private void computeEmpWage(){
		for (int i=0; i< numOfCompany; i++){
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
}
private int computeEmpWage(CompanyEmpWage companyEmpWage){
		//VARIABLES
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		//COMPUTATION
		while(totalEmpHrs <= companyEmpWage.MAX_HOURS_PER_MONTH && totalWorkingDays < companyEmpWage.NUM_OF_WORKING_DAYS){
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
		return totalEmpHrs * companyEmpWage.EMPLOYEE_WAGE_PER_HOUR;
	}


	public static void main(String args[]){
		System.out.println("Employee Wage Computation");
		EmpWageBuilderArray  EmpWage=new EmpWageBuilderArray();
		EmpWage.addCompanyEmpWage("SBI",20,5,10);
		EmpWage.addCompanyEmpWage("RBI",10,4,20);
		EmpWage.computeEmpWage();

	}
}
