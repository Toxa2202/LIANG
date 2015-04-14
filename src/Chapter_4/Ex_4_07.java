package Chapter_4;

public class Ex_4_07 {

	public static void main(String[] args) {
		double tuition = 10000;
		int year = 0;
		
		while(year < 10) {
			tuition *= 1.05;
			year ++;
		}
		System.out.printf("After ten years the tuition will be $%.2f\n", tuition);
		
		double tui = tuition;
		year = 0;
		while(year < 4){
			tui *= 1.05;
			year++;
		}
		System.out.println();
		System.out.printf("After ten years the total cost of four years will be $%.2f", tui);
	}
}
