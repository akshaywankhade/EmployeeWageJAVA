public class EmpWageBuilder {

	public static void main(String[] args) {
	//Constants
	int IS_FULL_TIME = 1;
	int EMP_RATE_PER_HOUR = 20;
	//Variable
	int empHrs = 0;
	int empWage = 0;
	//Computation
	double empCheck = Math.floor(Math.random() * 10) % 2;
	if (empCheck == IS_FULL_TIME) {
		System.out.println("Employee is Present");
		empHrs = 8;
	}
	else {
		System.out.println("Employee is Absent");
		empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage :" + empWage);
	}
	}
}

