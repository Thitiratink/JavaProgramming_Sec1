
public class Example701 {

	public static void main(String[] args) {
		int[] nums = {12,50,93,45,75,52,80};
		for(int i=0;i<nums.length;i++) {
			System.out.println("nums["+i+"]="+nums[i]);
		}
		
		System.out.println("using foreach to display value for array nums ");
		int j=0;
		for(int _nums : nums) {
			System.out.println("nums["+j+"]="+_nums);
			j = j+1;
		}
		printArray(nums);
	}
	public static void printArray(int[] number) {
		for(int i=0;i<number.length;i++) {
			System.out.println("nums["+i+"]="+number[i]);
		}
	}

}
