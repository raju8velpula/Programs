package array;

import java.util.Arrays;
import java.util.HashSet;

public class How_to_find_duplicate_number_on_Integer_array {
	
	public static void main(String[] args) {
		
		
		
		int[] a={1,8,4,2,3,5,2,2,9,4};
		
		Arrays.sort(a);
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for (int i = 1; i < a.length; i++) {
			if (a[i-1]==a[i]) {

				hs.add(a[i]);
				
			}
			
		}
		
		System.out.println(hs);

		
	}
	


}
