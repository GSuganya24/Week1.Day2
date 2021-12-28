package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int a = 34343;
		int b = a;
		int temp = 0;
		while(a>0) {
			int r = a%10;
			a = a/10;
			temp = (temp*10)+ r;
			
		}
		if (b==temp) {
			System.out.println(b +" is a palindrome number");
		}else {
			System.out.println(b +" is not a palindrome number");
		}
		
	}

}
