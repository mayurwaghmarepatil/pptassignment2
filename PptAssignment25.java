package ineuron;

import java.util.Arrays;

public class PptAssignment25 {
public static void main(String[] args) {
	int[] nums= {1,2,3};
	System.out.println(maximumProduct(nums));
}
public static int maximumProduct(int[] nums) {
	Arrays.sort(nums);
	int opt1=nums[0]*nums[1]*nums[nums.length-1];
	int opt2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
	return Math.max(opt1, opt2);
	
}
}
