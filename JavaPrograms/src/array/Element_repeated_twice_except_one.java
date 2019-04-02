package array;

public class Element_repeated_twice_except_one{
	
	public static void main(String[] args) {
		
		int a[]={1, 1, 2, 2, 3, 4, 4, 5, 5};
		
		for (int i = 0; i < a.length; i++) {
			
			int count=0;
			
			for (int j = 0; j < a.length; j++) {
				
				if (a[i]==a[j]) {
					
					count++;
					
				}
				
				
			}
			
			if (count!=2) {
				
				System.out.println(a[i]);
				
			}
			
		}

	
		
	}

}
