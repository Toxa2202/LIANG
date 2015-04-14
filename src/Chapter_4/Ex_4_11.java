package Chapter_4;

public class Ex_4_11 {
	public static void main(String[] args) {
		int numbersPerLine = 10;
		int count = 0;
		int number = 100;
		
		while(number < 200){
			if(number % 5 == 0 ^ number % 6 == 0){//chuslo dilutjsa na 5 abo na 6 ale ne razom
				count++;
				if(count % numbersPerLine == 0){
					System.out.println(number);
				} else {
					System.out.print(number + " ");
				}
			}
			number++;
		}
	}
}
