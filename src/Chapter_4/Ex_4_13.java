package Chapter_4;

public class Ex_4_13 {

	public static void main(String[] args) {
		int n = 0;
		int dig = 0;
		
		while(Math.pow(n, 3) < 12000){
			dig = n;
			n++;
		}
		System.out.println("The largest n such that n*n*n < 12000 is :" + dig);
	}
}
