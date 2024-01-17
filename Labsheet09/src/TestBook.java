import java.util.*;
public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input book title   : ");
		b1.setTitle(scan.nextLine());
		
		System.out.print("Input price        : ");
		b1.setPrice(scan.nextFloat());
		
		System.out.print("Input publish year : ");
		b1.setPublishyear(scan.nextInt());
		
		System.out.println();
		System.out.print(b1.toString());

	}

}
