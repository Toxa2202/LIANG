package Chapter_4;

public class Ex_4_20 {

	public static void main(String[] args) {
		final int NUMBERS_PER_LINE = 8;
		final int TOP = 1000;
		int number = 2;
		int count = 0;
		
		while(number <= TOP){
			boolean isPrime = true;
			
			for (int divisor = 2; divisor <= number/2; divisor++) {
				if(number % divisor == 0){
					isPrime = false;
					break;	
				}
			}
			
			if(isPrime){
				count++;
				
				if(count % NUMBERS_PER_LINE == 0){
					System.out.println(number);
				}
				else{
					System.out.print(number + "\t");
				}
			}
			number++;
		}

	}

}
