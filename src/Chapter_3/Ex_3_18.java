package Chapter_3;

import javax.swing.JOptionPane;

public class Ex_3_18 {

	public static void main(String[] args) {
		String yearString = JOptionPane.showInputDialog("Enter a year:");
		double isLeapYear = Double.parseDouble(yearString);
		int leap = (int)isLeapYear;
		
		boolean leapYear = 
				((leap % 4 == 0 && leap % 100 != 0) || (leap % 400 == 0));
		String output = leap + " is a leap year? " + leapYear;
		JOptionPane.showMessageDialog(null, output);
	}

}
