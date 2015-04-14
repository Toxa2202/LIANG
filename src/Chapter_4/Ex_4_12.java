package Chapter_4;

public class Ex_4_12 {

	public static void main(String[] args) {
		int n = 1_000_000;
		int dig = 0;
		
		while(Math.pow(n, 2) > 12000){
			dig = n;
			n--;
		}
		System.out.println("The smallest n such that n*n > 12000 is " + dig);
	}
}
