package solutions.solution2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = scan.next();
		System.out.println("Enter the salary: ");
		float salary = scan.nextFloat();
		System.out.println("Enter the pfpercentage: ");
		float pfpercentage = scan.nextFloat();
		PermanentEmployee sudhaObj = new PermanentEmployee(name, salary, pfpercentage);
		if(sudhaObj.validateInput()) {
		sudhaObj.findNetSalry();
		System.out.println("Employee Name: "+sudhaObj.getName());
		System.out.println("PF Amount: "+sudhaObj.getPfamount());
		System.out.println("Net Salary: "+sudhaObj.getNetsalary());
		}
		else {
			System.out.println("Error!!! Unable to calcualte the NetSalary");
		}
	}
}
