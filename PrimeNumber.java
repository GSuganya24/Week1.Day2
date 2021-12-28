package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		
	int a = 13;
	boolean x = false;
	
	for(int i=2;i<=a/2;i++) {
		int r = a%i;
		if(r==0) {
			x = true;
			break;
		}	
		}
	
if (x) {
	System.out.println(a +" is not a Prime number");
}
else {
	System.out.println(a +" is a Prime Number");
}
	
}
}