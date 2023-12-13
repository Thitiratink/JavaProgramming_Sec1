import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();	
		
		String firstName = "" , lastName = "";
		int countSpace = 0;
		for(int i=0 ; i < fullName.length()-1 ; i++) {
			if(fullName.charAt(i) == ' '){
				firstName = fullName.substring(0,i);
				lastName = fullName.substring(i+1);
				System.out.print("First Name: "+ firstName.toUpperCase() + "\nLast Name: " + lastName.toLowerCase() );
				countSpace++;
			}
		}
	if(countSpace == 0) {
		System.out.print("Incorrect Name");
	}
}
}
//System.out.print("First Name: ");
//System.out.print("Last Name: ");