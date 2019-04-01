package array;

import java.util.Arrays;

public class find_intersection_of_two_sorted_arrays {
	
	public static void main(String[] args) {
		
		int[]a={1,5,4,7,9,8,6};
		int[]b={0,5,7,3,2};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for (int i = 0; i < b.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if (b[i]==a[j]) {
					
					System.out.println(b[i]);
					
				}
				
			}
			
		}
				
		
	}

}
