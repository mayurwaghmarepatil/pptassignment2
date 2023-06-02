package ineuron;

import java.util.Arrays;

public class PptAssignment23 {

	public static void main(String[] args) {
		int[] nums= {1,3,2,2,5,2,3,7};
		System.out.println(findLHS(nums));

	}
	public static int findLHS(int[] nums) {
		int len=nums.length;
		int left=0;
		int result=0;
		Arrays.sort(nums);
		
		for(int i=0;i<len;i++) {
			while(left < i && nums[i]-nums[left] > 1L) {
				left++;
			}
			if(nums[i]-nums[left]==1L) {
				result=Math.max(i-left+1, result);
			}
		}
		return result;
	}

}
