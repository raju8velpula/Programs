package array;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Remove_duplicates_from_array {
	
	public static void main(String[] args) {
		
		
		 int[]a={0,5,678,5,4,85,4,5}; 
		 
		 LinkedHashSet<Integer>lhs=new  LinkedHashSet<Integer>();
		 
		 for (int i = 0; i < a.length; i++) {
			 lhs.add(a[i]);
			
		}
		 
		 int[] b=new int[lhs.size()];
		 
		 Iterator it=lhs.iterator();
		 
		for (int i = 0; i < b.length; i++) {
			b[i]=(int) it.next();
		}
		 
		 for (int i : b) {
			System.out.print(i+" ");
		}
		 
	}

}
