public class EmpWageBuilder{
	//CONSTANTS
	public final int IS_PART_TIME = 0;
	public final int IS_FULL_TIME = 1;
	
	public void calEmpWages(CompanyEmpWage company)
	{
		//VARIABLE
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while( totalEmpHrs <= company.getMaxHrsInMonth() && totalWorkingDays < company.getMaxWorkingDays() )
		 {
			totalWorkingDays++;
			int empCheck = (int) ( Math.random() * 10 ) % 3;
			switch (empCheck)
			{
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
			}
			//CALCULATE TOTAL EMP HRS
			totalEmpHrs += empHrs;
			//PRINT DAILY MANY WORK HOURS 
			System.out.println("Day: " + totalWorkingDays + " Emp Hr: " +  empHrs);
		}
		// CALCULATE TOTAL WAGE
		company.setTotalEmpWage(totalEmpHrs * company.getEmpRatePerHrs());
		System.out.println("Total Wage of " + company.getCompanyName() + " Employee is " + company.getTotalEmpWage());	
	}

	public static void main(String args[])
	{
		EmpWageBuilder empwagecomputation = new EmpWageBuilder();
		CompanyEmpWage[] companys=new CompanyEmpWage[2];

		companys[0] = new CompanyEmpWage("BRIDGELABZ",20,20,100);
		empwagecomputation.calEmpWages(companys[0]);
		
		companys[1]= new CompanyEmpWage("CAPGMINI",50, 15, 100 );
		empwagecomputation.calEmpWages(companys[1]);	
	}
}

class CompanyEmpWage
{
	public int EMP_RATE_PER_HRS;
	public int MAX_WORKING_DAYS;
	public int MAX_HRS_IN_MONTH;
	public String COMPANY_NAME;
	
	public int totalEmpWage=0;
	
	public CompanyEmpWage(String COMPANY_NAME,int EMP_RATE_PER_HRS, int MAX_WORKING_DAYS, int MAX_HRS_IN_MONTH)
	{
		this.EMP_RATE_PER_HRS = EMP_RATE_PER_HRS;
		this.MAX_WORKING_DAYS = MAX_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
		this.COMPANY_NAME=COMPANY_NAME;
	}
	//GETTER METHODS
	public int getEmpRatePerHrs()
	{
		return EMP_RATE_PER_HRS;
	}

	public int getMaxWorkingDays()
	{
		return MAX_WORKING_DAYS;
	}

	public int getMaxHrsInMonth()
	{
		return MAX_HRS_IN_MONTH;
	}
	public String getCompanyName()	{
		return COMPANY_NAME;
	}
	public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage=totalEmpWage;
	}
	public int getTotalEmpWage()
	{
		return totalEmpWage;
	}
}
