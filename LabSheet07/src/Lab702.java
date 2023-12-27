import java.util.*;
import java.text.*;
public class Lab702 {

	public static void main(String[] args) {
		DecimalFormat frmid = new DecimalFormat("00.00");
		Scanner scan = new Scanner(System.in);
		double[] score = new double [5];
		double ave = 0,tt=0;
		for(int i=0;i<score.length;i++) {
			System.out.print("Input score of student " +(i+1)+ ": ");
			score[i] = scan.nextDouble();
			tt += score[i];
			}
		
		ave = tt/score.length;
		//System.out.println();
		System.out.print("\nAverage of 5 student is "+ frmid.format(ave));
		
		int j=1;
		for(double _score : score) {
			if(_score > ave) {
				System.out.println("> Student "+ j++ +" ("+ frmid.format(_score)+") ");
			}
		}
		}
	}


