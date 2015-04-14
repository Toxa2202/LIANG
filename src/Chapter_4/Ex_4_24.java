package Chapter_4;

public class Ex_4_24 {

	public static void main(String[] args) {
		double res = 0;
		for (double i = 1; i <= 99; i+=2) {
			res += i/(i+2);
		}
		System.out.println("Result is :" + res);
	}

}
