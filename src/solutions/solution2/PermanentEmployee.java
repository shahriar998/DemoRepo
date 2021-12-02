package solutions.solution2;

public class PermanentEmployee extends Employee{
	
	private float pfpercentage;
	public float getPfpercentage() {
		return pfpercentage;
	}

	public void setPfpercentage(float pfpercentage) {
		this.pfpercentage = pfpercentage;
	}

	public float getPfamount() {
		return pfamount;
	}

	public void setPfamount(float pfamount) {
		this.pfamount = pfamount;
	}

	private float pfamount;
	
	PermanentEmployee(String name, float salary, float pfpercentage) {
		super(name,salary);
		this.pfpercentage = pfpercentage;
		
	}
	
	void findNetSalry() {
		pfamount = super.getSalary()*(pfpercentage/100);
		setNetsalary((super.getSalary()-pfamount));
	}
	
	boolean validateInput() {
		
		if(getSalary()>0 && pfpercentage>=0 ) {
			return true;
		}
		else {
			return false;
		}
	}

}
