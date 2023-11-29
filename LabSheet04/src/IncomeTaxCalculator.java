import java.util.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		// Declare constants first (variables may use these constants)
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;

		// Declare variables
		int taxableIncome;
		double taxPayable;
		//Assume input tax income
		taxableIncome = 20001;
		
		//Compute tax payable using a nested-if 4 cases
		if(taxableIncome <= 20000) {
			taxPayable = 0;
		}
		else if(taxableIncome <= 40000) {
			taxPayable = (taxableIncome-20000)*TAX_RATE_ABOVE_20K;
		}
		else if(taxableIncome <= 60000) {
			taxPayable = 20000*TAX_RATE_ABOVE_20K+(taxableIncome-40000)*TAX_RATE_ABOVE_40K;
		}
		else {
			taxPayable = (20000*TAX_RATE_ABOVE_20K)+(20000*TAX_RATE_ABOVE_40K)+(taxableIncome-60000)*TAX_RATE_ABOVE_60K;
		}
		System.out.printf("Yhe income tax payable is : %.2f " , taxPayable);
		
	}

}
