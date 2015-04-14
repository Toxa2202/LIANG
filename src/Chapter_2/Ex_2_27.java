package Chapter_2;
import javax.swing.JOptionPane;

public class Ex_2_27 {
	public static void main(String[] args){
		String nameString = JOptionPane.showInputDialog("Enter employees name:");
		String hoursString = JOptionPane.showInputDialog("Enter number of hours worked in a week:");
		String payString = JOptionPane.showInputDialog("Enter hourly pay rate:");
		String federalString = JOptionPane.showInputDialog("Enter federal tax withholding rate:");
		String stateString = JOptionPane.showInputDialog("Enter state tax withholding rate:");
		
		double hours = Double.parseDouble(hoursString);
		double pay = Double.parseDouble(payString);
		double federal = Double.parseDouble(federalString);
		double state = Double.parseDouble(stateString);
		double grossPay = pay * hours;
		federal = grossPay * (federal / 100);
		state = grossPay * (state / 100);
		double total = federal + state;
		double netPay = grossPay - total;
		
		String output = "Employee Name: " + nameString + "\n" 
				+ "Hours Worked: " + hours + "\n"
				+ "Pay Rate: " + pay + "\n"
				+ "Gross Pay: " + grossPay + "\n" 
				+ "Deductions:" + "\n"
				+ "\t" + "Federal Withholding (20.0%): " + (int)(federal * 100) / 100.0 + "\n"
				+ "\t" + "State Withholding (9.0%): " + (int) (state * 100) / 100.0  + "\n"
				+ "\t" + "Total Deduction: " + (int)(total * 100) / 100.0 + "\n"
				+ "Net Pay: " + (int)(netPay * 100) / 100.0;
		JOptionPane.showMessageDialog(null, output);
	}

}
