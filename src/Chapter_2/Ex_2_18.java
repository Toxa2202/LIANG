package Chapter_2;

public class Ex_2_18 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = (int)Math.pow(a, b);
		System.out.println("a" + "   " + "b" + "   " + "pow(a, b)");
		System.out.println( a + "   " + b + "   " + c);
		System.out.println( (a+1) + "   " + (b+1) + "   " + (int)Math.pow(a+1, b+1));
		System.out.println( (a+2) + "   " + (b+2) + "   " + (int)Math.pow(a+2, b+2));
		System.out.println( (a+3) + "   " + (b+3) + "   " + (int)Math.pow(a+3, b+3));
		System.out.println( (a+4) + "   " + (b+4) + "   " + (int)Math.pow(a+4, b+4));
		
		
	}

}
