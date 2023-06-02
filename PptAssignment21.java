package ineuron;

import java.util.Arrays;

public class PptAssignment21 {
public static void main(String[] args) {
	int[] nums= {1,4,3,2};
	System.out.println(arrayPairSum(nums));
}
public static int arrayPairSum(int[] nums) {
	Arrays.sort(nums);
	int len=nums.length;
	int result=0;
	for(int i=0;i<len-1;i+=2) {
		result+=nums[i];
	}
	return result;
}
}
