package Chapter_4;

public class Ex_4_05 {

	public static void main(String[] args) {
		int kilo = 1;
		double pound = 2.2;
		int pounds = 20;
		double kilos = pounds * 0.453;
		System.out.println("Kilograms\tPounds\t\t|\t Pounds\t\tKilograms");
		
		while(kilo < 200 && pounds <= 515) {
			System.out.printf("%3d\t\t%.1f\t\t|\t%3d \t\t%.2f\n",kilo, pound, pounds, kilos);
			kilo += 2;
			pound = kilo * 2.2;
			pounds += 5;
			kilos = pounds * 0.453;
		}
	}

}
