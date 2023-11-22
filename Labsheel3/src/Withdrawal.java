import javax.swing.*;
import java.util.Random;
import java.text.DecimalFormat;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("###,###");
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		//JOptionPane.showMessageDialog(null, "Your balance: " + balance);
		int money = Integer.parseInt(JOptionPane.showInputDialog("Your balance: " + frm.format(balance) + "\nInput money to withdraw:"));
		if(money > balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(money > 20000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if((money % 100)!=0) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw "+ money%100 + " baht." ,"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			int thousand = money / 1000;
			int fivehundred = money % 1000 / 500;
			int hundred = money % 500 / 100;
			JOptionPane.showMessageDialog(null, "You withdraw "+ frm.format(money) + " baht." + "\n1,000 = " + thousand
					                          + "\n500 = " + fivehundred + "\n100 = " + hundred );
		}
	}

}