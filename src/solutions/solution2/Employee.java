package solutions.solution2;

public class Employee {
	
	private String name;
	private float salary;
	private float netsalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(float netsalary) {
		this.netsalary = netsalary;
	}

	Employee(String name,float salary){
		this.name = name;
		this.salary = salary;
	}
	
	
	
	

}
