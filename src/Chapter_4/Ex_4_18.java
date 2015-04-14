package Chapter_4;

public class Ex_4_18 {
	public static void main(String[] args) {
		int lines = 6;
		int c = 1;
		for (int i = 1; i <= lines; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
		}
		
		System.out.println();	
	}
}