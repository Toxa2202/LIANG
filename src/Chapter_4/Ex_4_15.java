package Chapter_4;

public class Ex_4_15 {
	public static void main(String[] args) {
		char a = '~';
		int numPerLine = 10;
		for (char b = '!'; b < a; b++) {
			System.out.print(b + "  ");
			if ((int)b % numPerLine == 2) {
				System.out.println();
			}
		}
	}
}

//Mu stvorulu diapazon char vid '!' do '~' pru ymovi vuvody 10 sumvoliv na rjadok
