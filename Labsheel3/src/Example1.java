import javax.swing.*;

public class Example1 {
	public static void main(String[] args) {
		final int BUFFET = 299;
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		double discount , totalPrice = 0;
		totalPrice = BUFFET * numberofCustomer;
		//JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPrice + "baht.");
		int memberCard;
		do {
			memberCard = JOptionPane.showConfirmDialog(null, "Total price is "+ totalPrice +"baht."+ "\nDo you have a member card?");
		}while(memberCard == JOptionPane.CANCEL_OPTION);

		if(memberCard == JOptionPane.YES_OPTION) {
			discount = totalPrice * 90/100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + discount + "baht.");
		}
		else if(memberCard == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPrice + "baht.");
		}
	}
}