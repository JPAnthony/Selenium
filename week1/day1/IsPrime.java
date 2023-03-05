package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		IsPrime o = new IsPrime();
		o.checkSingleValue();
		o.checkMultipleValue();
		
	}
	private void checkSingleValue() {
		int num = 36;
		if (num%2==0) {
			System.out.println("The given number " +num +" is prime.");			
		}
	}
	private void checkMultipleValue() {
		int num=36;
		for (int i = 2; i < num-1; i++) {
			if (i%2==0) {
				System.out.println("The Given Number"+i+"is prime");
			}
			else {
				System.out.println("The Given Number"+i+"is not prime");
			}
			
		}
	
	}
}
