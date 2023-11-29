import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value1 , value2;
		
			System.out.print("Input value of X : ");
			value1 = scan.nextInt();
			System.out.print("Input value of Y : ");
			value2 = scan.nextInt();
			do{
				if(value2 < value1) {	
				System.out.print("Input value of Y,again : ");
				value2 = scan.nextInt();
				}
				else {
					break;
				}
			}while(true);
			for(int i = value1+1 ; i <= value2 ; i++) {
				System.out.println(value1 + " + " + i + " = " + (value1+=i));
			}

}
}
