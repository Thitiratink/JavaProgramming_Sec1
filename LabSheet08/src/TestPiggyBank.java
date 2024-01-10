import java.util.*;
public class TestPiggyBank {
	static PiggyBank pb = new PiggyBank();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addTwo(34);
		System.out.println("Add 2 Baht Money : "+ 34);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addTen(13);
		System.out.println("Add 10 Baht Money : "+ 13);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addFive(100); */
		
		inputCoin();
	}
	public static void inputCoin() {
		System.out.println("Money Total : "+ pb.getTotal());
		System.out.print("Please define size of PiggyBank: ");
		int sizeofPiggBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggBank);
		System.out.println("Size of your PiggyBank : "+ pb.getPiggyBank() );
		MainMenu();
	}
	public static void MainMenu() {
		int choice;
		while(true) {
			System.out.println("==========================");
			System.out.println("Menu of PiggyBank");
			System.out.println("==========================");
			System.out.println("[1] one baht.\n[2] two baht.\n[3] five baht.\n[4] ten baht.\n[5] Exit");
			System.out.println("==========================");
			System.out.print("Plest Select Menu[1-5] : ");
			choice = scan.nextInt();
			//System.out.println("Insert 1 Baht Money: ");
			int tt;
			if(choice == 1) {
				System.out.print("Insert 1 Baht Money: ");
				pb.addOne(scan.nextInt());
				System.out.println("Money Total : "+ pb.getTotal());
			}
			else if(choice == 2) {
				System.out.print("Insert 2 Baht Money: ");
				pb.addTwo(scan.nextInt());
				System.out.println("Money Total : "+ pb.getTotal());
			}
			else if(choice == 3) {
				System.out.print("Insert 5 Baht Money: ");
				pb.addFive(scan.nextInt());
				System.out.println("Money Total : "+ pb.getTotal());
			}
			else if(choice == 4) {
				System.out.print("Insert 10 Baht Money: ");
				pb.addTen(scan.nextInt());
				System.out.println("Money Total : "+ pb.getTotal());
			}
			else {
				System.out.print("Bye Bye");
				break;
			}
			/*
			System.out.println("Money Total : ");*/
			
		}
	}

}
