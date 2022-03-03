package ifstatement;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String userName;
	String userInputString;
	int userHours;
	double userHourlyWage;
	double userWage;
	
	
	userName = JOptionPane.showInputDialog("Welcome to Payroll. Please enter associates name: ");
	
	userInputString = JOptionPane.showInputDialog("How many hours did " + userName + " work this week? : ");
	userHours = Integer.parseInt(userInputString);
	
	JOptionPane.showInputDialog("How much does " + userName + " get paid an hour: ");
	userHourlyWage = Double.parseDouble(userInputString);
	
	userWage = userHours * userHourlyWage;
	JOptionPane.showMessageDialog(null, userName + " makes " + "$"  + userWage + " every week ");
	
			
	System.exit(0);
}
	
}
