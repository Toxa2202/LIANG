package Chapter_4;

public class Ex_4_06 {

	public static void main(String[] args) {
		int m = 1;
		double km = 1.609;
		int kilometer = 20;
		double miles = kilometer * 0.621;
		System.out.println("  Miles\t\tKilometers\t|\t Kilometers\tMiles");
		
		while(m <= 10 && kilometer <= 65) {
			System.out.printf("%3d\t\t%.3f\t\t|\t%3d \t\t%.3f\n",m, km, kilometer, miles);
			m ++;
			km = m * 1.609;
			kilometer += 5;
			miles = kilometer * 0.621;
		}
	}

}
