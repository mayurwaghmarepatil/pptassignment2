package ineuron;

import java.util.HashSet;
import java.util.Set;

public class PptAssignment22 {

	public static void main(String[] args) {
		int[] candy= {1,1,2,2,3,3};
		System.out.println(distrubuteCandy(candy));

	}
	public static int distrubuteCandy(int[] candy) {
		Set<Integer> s =new HashSet<>();
		for(int c:candy) {
			s.add(c);
		}
		return Math.min(candy.length >> 1,s.size());
	}

}
