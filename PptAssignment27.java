package ineuron;

public class PptAssignment27 {
	public static boolean isMonotonic(int[] A) {
		boolean incr=true;
		boolean dec=true;
		int n=A.length;
	
		for(int i=0;i<n-1;++i) {
			if(A[i]>A[i+1]) {
				incr=false;
			}
			else if(A[i]<A[i+1]) {
				dec=false;
			}
			
		}
		return incr || dec;
	}
	

	public static void main(String[] args) {
		int[] arr= {1,2,2,3};
		boolean ans=isMonotonic(arr);
		System.out.println(ans);
	}
	
}
