import java.util.*;
import java.io.*;

public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Header();
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		int i=1;
		
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String fname = readFile.next().toUpperCase();
			String lname = readFile.next();
			String fName = fname.substring(0,1);
			String grade = readFile.next();
			double ugrade = Double.parseDouble(grade);
			readFile.next();
			System.out.println(i + ".\t" + id + "\t" + Level(id) + "\t "+ fName + "." + lname + "\t" + grade + "\t" + Status(ugrade));
			i++;
		}
		readFile.close();
		
	}
	
	public static void Header() {
		System.out.println("No.\tID\t\tLevet\t Name\t\tGrade\tStatus");
		System.out.println("****************************************************************************");
	}
	
	public static String Level(String id) throws IOException {
		if(id.startsWith("18")) {
			return "3th";
		}
		else {
			return "4th";
		}
	}
	
	public static String Status(double ugrade) {
		if(ugrade >= 2.00) {
			return "Pass";
		}
		else if(ugrade >= 1.00) {
			return "Critical";
		}
		else {
			return "Retired";
		}
		
	}

}
