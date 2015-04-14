package Chapter_3;

public class Ex_3_16 {

	public static void main(String[] args) {
		System.out.println("This program display random uppercase letter: ");
		int letter = 65 + (int)(Math.random() * (90 - 65) + 1);
			
		char l = (char) letter;
		System.out.println(l);
	}

}
