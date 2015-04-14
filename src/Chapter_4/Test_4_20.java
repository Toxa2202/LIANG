package Chapter_4;

public class Test_4_20 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
				System.out.print(num + "xxx");
				num *= 2;
			}
			
			System.out.println();
			i++;
		}
	}

}