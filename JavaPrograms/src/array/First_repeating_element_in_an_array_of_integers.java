package array;

import java.util.Arrays;

public class First_repeating_element_in_an_array_of_integers{

	public static void main(String[] args) {
		
		int []a = {10, 5, 3, 4, 3, 5, 6, 1, 1};
		

		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]);
				
				return;
				}
				
				
			}
			
			
		}

		
		
	}

}