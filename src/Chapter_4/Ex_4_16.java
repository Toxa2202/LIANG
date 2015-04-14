package Chapter_4;
import java.util.Scanner;

public class Ex_4_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Input any integer number:");
		int num = input.nextInt();
		int div = 2;
		if (num == 1 || num == 2 || num == 3){
			System.out.println("There is prime number" + num);
		}
		
		//ymova while obrahovyje prosti chusla dlja num
		while (div <= num){
			if (num % div == 0){
				num = num/div;
				System.out.print(" " + div);
			}
			else{
				div++;
			}
		}
		
	}
}

//Proga vuvodutj prosti 4usla na jaki dilutjsja num