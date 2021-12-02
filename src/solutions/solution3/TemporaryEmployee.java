package solutions.solution3;

public class TemporaryEmployee extends Employee{
	private int hoursWorked;
	private int hourlyWages;
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}

	
	TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
		
	}
	
	@Override
	public void calculateSalary() {
		super.setSalary( (hourlyWages* hoursWorked));
//		System.out.println(super.getSalary());
		
	}
	
	

}
