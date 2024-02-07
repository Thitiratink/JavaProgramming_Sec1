import java.util.*;
import java.io.*;

public class Lab1202 {
	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		Scanner input = new Scanner(System.in);
		System.out.print("");
		String emailin =input.nextLine().toLowerCase();
		
		while(readFile.hasNext()) {
			readFile.next();
			readFile.next();
			readFile.next();
			String password = readFile.next();
			String email = readFile.next().toLowerCase();
			
			if(emailin == email) {
				System.out.print("Your password is " + password);
			}
			else {
				System.out.print("The data not found....");
				break;
			}
			
		}
		readFile.close();
	}
}
