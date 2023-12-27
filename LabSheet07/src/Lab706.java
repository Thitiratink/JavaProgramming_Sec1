import javax.swing.JOptionPane;

public class Lab706 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		
		int indexNumber = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		
		while(checkIndex(nums,indexNumber)) {
			indexNumber = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, agin: "));
		}
		int currentValue = currentData(nums,indexNumber);
		int prevValue = prevData(nums,indexNumber);
		int nextValue = nextData(nums,indexNumber);
		
		if(((prevData(nums,indexNumber))!=-1) && ((nextData(nums,indexNumber))!=-1)) {
			JOptionPane.showMessageDialog(null,"Current data,nums["+indexNumber+"] is "+currentValue
				+"\nPrevious data, nums["+(indexNumber-1)+"] is "+prevValue
				+"\nNext data, nums["+(indexNumber+1)+"] is "+nextValue);
		}
		else if(prevData(nums,indexNumber)==-1) {
			JOptionPane.showMessageDialog(null,"Current data,nums["+indexNumber+"] is "+currentValue
					+"\nNo Previous data"
					+"\nNext data, nums["+(indexNumber+1)+"] is "+nextValue);
		}
		else if ((nextData(nums,indexNumber))==-1) {
			JOptionPane.showMessageDialog(null,"Current data,nums["+indexNumber+"] is "+currentValue
					+"\nPrevious data, nums["+(indexNumber-1)+"] is "+prevValue
					+"\nNo next data");
		}
		
		//
	}//main
	
	public static boolean checkIndex(int[] number, int index) {
		if((index >= number.length) || (index<0)) {
			return true;
		}
		else {
			return false;
		}
		//return ((index>=number.length) || (index<0))?true:false;
	}//boolean
	
	public static int currentData(int[] nums,int index) {
		return nums[index];
	}//int1
	
	public static int prevData(int[] nums,int index) {
		if((index-1)==-1) {
			return-1;
		}
		return nums[index-1];
	}//int2
	
	public static int nextData(int[] nums,int index) {
		if((index+1)==nums.length) {
			return-1;
		}
		return nums[index+1];
	}//int3

}
