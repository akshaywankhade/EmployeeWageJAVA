public class CompanyEmpWage{
	//CONSTANTS 
	public final String company;
	public final int EMPLOYEE_WAGE_PER_HOUR;
	public final int NUM_OF_WORKING_DAYS;
	public final int MAX_HOURS_PER_MONTH;
	public int TOTAL_EMP_WAGE;
	
	public CompanyEmpWage(String company, int EMPLOYEE_WAGE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HOURS_PER_MONTH){
		this.company=company;
		this.EMPLOYEE_WAGE_PER_HOUR=EMPLOYEE_WAGE_PER_HOUR;
		this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
		this.MAX_HOURS_PER_MONTH=MAX_HOURS_PER_MONTH;
	}

	public void setTotalEmpWage(int totalEmpWage){
		this.totalEmpWage = totalEmpWage;
	}
	
	public String toString(){
		return "Total Emp Wage for Company: " +company+" is : "+totalEmpWage;
	}
}
