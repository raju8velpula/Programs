package array;

public class Find_second_largest_value_in_array {

	public static void main(String[] args) {
		
		 int[]a={0,5,678,5,4,85,4,98,5}; 
		 
		 int largest=a[0];
		 int secondLargest=a[1];
		 
		 for (int i = 0; i < a.length; i++) {
			 
			 if (largest<a[i]) {
				 
				largest=a[i];
			}else if (secondLargest<a[i]) {
				
				secondLargest=a[i];
				
			}
			
		}
		 
		 System.out.println(largest+"  "+secondLargest);
	}

}
