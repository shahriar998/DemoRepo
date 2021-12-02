package solutions.solution3;

public class PermanentEmployee extends Employee{
	
	private double basicPay;

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {
	double pfAmount = this.basicPay * 0.12;
	super.setSalary(this.basicPay-pfAmount);
	
	}

}
