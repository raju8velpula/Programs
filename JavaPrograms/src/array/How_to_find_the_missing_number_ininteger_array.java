package array;

import java.util.Arrays;

public class How_to_find_the_missing_number_ininteger_array
{
    
	public static void main(String[] args) {
		int[] a={1,8,4,3,5,2,9};
		Arrays.sort(a);
		
		int consucutive=1;
		
		for (int i = 1; i < a.length; i++) {
			
			
			if (a[i-1]+consucutive!=a[i]) {
				
				System.out.println(a[i-1]+consucutive);
				a[i]=a[i-1]+consucutive;
			}
			
			
		}
		
		
		
		
	}

	
	
	
}