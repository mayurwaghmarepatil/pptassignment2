package ineuron;

public class PptAssignment24 {

	public static void main(String[] args) {
		int[] flowerbed= {1,0,0,0,1};
		int n=1;
		System.out.println(canPlaceFlower(flowerbed,n));
	}
	public static boolean canPlaceFlower(int[] flowerbed,int n) {
		if(flowerbed== null || flowerbed.length==0) {
			return false;
		}
		int count=0;
		for(int i=0;i<flowerbed.length;i++) {
			if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i== flowerbed.length-1 || flowerbed[i+1]==0)) {
				flowerbed[i]=1;
				count++;
			}
			if(count>=n) {
				return true;
			}
		}
		return false;
	}

}
