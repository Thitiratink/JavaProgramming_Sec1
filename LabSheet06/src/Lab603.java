import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullName = scan.nextLine();
		String firstL = fullName.substring(0,fullName.indexOf(" "));
		System.out.print(abbreviatName(fullName)+firstL);

	}
	public static String abbreviatName (String fullname) {
		String lastL = "";
		for(int i = 0; i <= fullname.length()-1;i++) {
			if(fullname.charAt(i)==' ') {
				lastL = lastL+fullname.charAt(i+1)+".";
			}
			
		}return lastL;
	}

}
