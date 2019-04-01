package array;

import java.util.Arrays;

public class How_to_find_largest_and_smallest_number_in_unsorted_array{

	public static void main(String[] args) {
		
	 int[]a={0,5,678,5,4,85,4,5}; 
	 
	 int smallest=Integer.MAX_VALUE;
	 int largest=Integer.MIN_VALUE;
	 
	 for (int i : a) {
		 
		 if (i<smallest) {
			 smallest=i;
			
		}else if (i>largest) {
			
			largest=i;
			
		}
		
	}
	 
	 
		System.out.println(smallest+" , "+largest);
	}

	}

	
	

