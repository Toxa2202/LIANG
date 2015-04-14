package Chapter_4;

public class Ex_4_23 {

	public static void main(String[] args) {
		double res1 = 0;
		double res2 = 0;
		double n = 50000;
		
		for (double i = 1; i <= n; i++) {
			res1 += 1/i;
		}
		System.out.println("Result is: " + res1);
		
		for (double j = n; j >= 1 ; j--) {
			res2 += 1/j; 
		}
		System.out.println("Result is: " + res2);
	}

}
