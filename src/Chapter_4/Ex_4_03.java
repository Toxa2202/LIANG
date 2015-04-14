package Chapter_4;

public class Ex_4_03 {

	public static void main(String[] args) {
		int kilo = 1;
		double pound = 2.2;
		System.out.println("Kilograms       Pounds");
		
		while (kilo < 200){
			System.out.printf("%3d \t\t%.1f\n",kilo, pound);//vidrizalu desjatkovi znaku do odnogo
			kilo++;
			pound = kilo * 2.2;
		}

	}

}
