import java.io.*;
import java.util.Scanner;

public class Lab1204 {

	public static void main(String[] args) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rating books: ");
		double inputr = input.nextDouble();
		int countBook = 0,i=1;
		System.out.println("-----------------------------------------------------------------");
		while((tmp = readFile.readLine()) != null) {
			String[] data = tmp.split("\t");
			Double rating = Double.parseDouble(data[2]);
			
			if(rating >= 4.8) {
				System.out.println("Book " +i+ ":" + data[0] + "(" + data[3] + ") reviews ");
				countBook++;
			}
			
			i++;
			
		}
		readFile.close();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("There are "+ countBook + " book get rating more than " + inputr);
	}

}
