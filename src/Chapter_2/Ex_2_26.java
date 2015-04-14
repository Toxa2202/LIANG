package Chapter_2;
import javax.swing.JOptionPane;

public class Ex_2_26 {

	public static void main(String[] args) {
		//Виводимо повідомлення і вносимо значення
		String amountString = JOptionPane.showInputDialog("Enter an amount, for example, 11,56:");
		//Конвертуємо строку в Double
		double amount = Double.parseDouble(amountString);
		//Перевели в int і отримали центи (число без коми)
		int remainingAmount = (int)(amount * 100);
		
		//Обчислюємо кількість доларів, четвертаків, десяток, п"ятірок, центів
		int dollars = remainingAmount / 100;
		remainingAmount %= 100;
		int quarters = remainingAmount / 25;
		remainingAmount %= 25;
		int dimes = remainingAmount / 10;
		remainingAmount %= 10;
		int nickels = remainingAmount / 5;
		remainingAmount %= 5;
		int pennies = remainingAmount;
		
		String output = "Your amount " + amount + " consists of \n" 
				+ "\t" + dollars + " dollars \n"
				+ "\t" + quarters + " quarters \n"
				+ "\t" + dimes + " dimes \n" 
				+ "\t" + nickels + " nickels \n"
				+ "\t" + pennies + " pennies";
		JOptionPane.showMessageDialog(null, output);
	}

}
