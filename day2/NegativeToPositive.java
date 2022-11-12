package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		int number = -40;
		if (number<0) {
			System.out.println(number+ "This is negative number");
			
			int positive= number*-1;
			System.out.println("This number "+number+" is converted to " +positive );
		}
		
		else {
			System.out.println("positive");
			
		}
	}

}
