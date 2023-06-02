package ineuron;

public class PptAssignment28 {

	public static void main(String[] args) {
	int[] nums= {1};
	int k = 0;
	System.out.println(smallestRange(nums,k));
	}
	public static int smallestRange(int[] nums,int k) {
		int min=nums[0];
		int max=nums[0];
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min)
			{
				min=nums[i];
			}
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		int ma=max-k;
		int mi=min+k;
		
		if(mi>ma) {
			return 0;
		}
		return 0;
	}

}
