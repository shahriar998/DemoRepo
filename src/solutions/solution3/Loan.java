package solutions.solution3;

public class Loan {
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmount;
		if(employeeObj instanceof PermanentEmployee) {
			//System.out.println(employeeObj.getSalary());
			loanAmount = employeeObj.getSalary() * 0.15;
			return loanAmount;
			
		}
		else {
		loanAmount = employeeObj.getSalary() *0.10;
//		System.out.println("Hello"+employeeObj.getSalary());
//		System.out.println("Loan Amount: "+loanAmount);
		return loanAmount;
		}
	}

}
