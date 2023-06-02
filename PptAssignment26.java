package ineuron;

public class PptAssignment26 {

	public static void main(String[] args) {
		int[] nums= {-1,0,3,5,9,12};
		int target=9;
		System.out.println(search(nums,target));
	}
	
    public static int search(int[] nums,int target) {
    	int n=nums.length;
    	int l=0,h=n-1;
    	
    	while(l<=h)
    	{
    		int p=(l+h)/2;
    		if(nums[p]==target)
    		{
    	return p;
    		}
    		else if(nums[p]<target) 
    		{
           l=p+1;
    		}
    		else 
    		{
    			h=p-1;
    	}
    	  	
    }
    	return -1;
    }
}