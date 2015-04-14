package Chapter_4;

public class Ex_4_04 {

	public static void main(String[] args) {
		int miles = 1;
		double kilometers = 1.609;
		System.out.println("Miles\tKilometers");
		while(miles <= 10) {
			System.out.printf("%3d \t%.3f\n",miles, kilometers);
			miles++;
			kilometers = miles * 1.609;
		}
	}

}
