import java.util.*;
import java.io.*;

public class Lab1201 {
	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) {
			String lname = readFile.next();
			String fname = readFile.next();
			String fName = fname.substring(0,1);
			readFile.next();
			String email = readFile.next().toUpperCase();
			
			System.out.println(fName + "." + lname + " (" + email + ")" );
		}
	}
}
