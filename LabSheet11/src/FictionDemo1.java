import java.util.*;
public class FictionDemo1 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("");
		String title = scan.nextLine();
		System.out.print("");
		int publicYear = scan.nextInt();
	
		FictionBook fb1 = new FictionBook(title,publicYear);
		
		
		do {
			System.out.print("");
			String name = scan.nextLine();
			fb1.setAuthorname(name);
		}
		while(!fb1.checkFormatname());
		
		do {
			System.out.print("");
			String email = scan.nextLine();
			fb1.checkEmail();
		}
		while(!fb1.checkEmail());
		System.out.print(fb1);
}
}
