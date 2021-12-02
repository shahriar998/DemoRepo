package solutions.solution3;

public class Main {
	
	public static void main(String[] args) {
		
		PermanentEmployee pE = new PermanentEmployee(101, "Shah", 45000);
		pE.calculateSalary();
//		System.out.println(pE.getSalary());
		Loan lPE = new Loan();
		System.out.println("Loan amount of Permanent Employee: "+lPE.calculateLoanAmount(pE));
		
		TemporaryEmployee tE = new TemporaryEmployee(102, "Nima", 40, 16);
//		System.out.println(tE.getSalary());
//		System.out.println();
		tE.calculateSalary();
//		System.out.println();
		System.out.println("Loan amount of Temporary Employee: "+lPE.calculateLoanAmount(tE));
		
	}

}
