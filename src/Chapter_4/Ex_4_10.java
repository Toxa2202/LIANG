package Chapter_4;

public class Ex_4_10 {

	public static void main(String[] args) {
		final int NUMBERS_PER_LINE = 10;
		int count = 0;//kilkist potribnukh chusel
		int number = 100;//chuslo jake byde perevirjatus na ymovy zadachi
		
		System.out.println("The first 50 numbers divisible by 5 and 6:");
		
		while(number < 1000) {
			if(number % 5 == 0 && number % 6 == 0){
				count++;
				if(count % NUMBERS_PER_LINE == 0){
					System.out.println(number);
				} else {
					System.out.print(number + "  ");
				}
			}
			number++;
		}
	}

}
