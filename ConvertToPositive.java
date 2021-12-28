package week1.day2;

public class ConvertToPositive {
	public static void main(String[] args) {
		int a = -40;
		int b = 0;
		if (a<0) {
			System.out.println(a + " is a negative number");
			b = (-2*a)+a;
			System.out.println("The positive number of "+a+" is " +b);
			
		}else {
			System.out.println(a + " is a positive number");
		}
	}

}
