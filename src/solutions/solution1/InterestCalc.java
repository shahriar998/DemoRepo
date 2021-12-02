package solutions.solution1;

public class InterestCalc implements Percentage{

	@Override
	public double calculateInterest(double amount) {
		double am = amount*(rateOfInterest/100);
		return am;
	}

	public static void main(String[] args) {
		InterestCalc obj = new InterestCalc();
		System.out.println(Math.round(obj.calculateInterest(3500000)));
	}
}
